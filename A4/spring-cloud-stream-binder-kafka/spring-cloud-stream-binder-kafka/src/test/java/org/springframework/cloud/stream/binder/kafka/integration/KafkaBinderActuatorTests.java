/*
 * Copyright 2018-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.stream.binder.kafka.integration;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.binder.MeterBinder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.DirectFieldAccessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.FilteredClassLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.cloud.stream.binder.Binding;
import org.springframework.cloud.stream.binding.BindingService;
import org.springframework.cloud.stream.config.ConsumerEndpointCustomizer;
import org.springframework.cloud.stream.config.ListenerContainerCustomizer;
import org.springframework.cloud.stream.config.MessageSourceCustomizer;
import org.springframework.cloud.stream.config.ProducerMessageHandlerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.kafka.inbound.KafkaMessageDrivenChannelAdapter;
import org.springframework.integration.kafka.inbound.KafkaMessageSource;
import org.springframework.integration.kafka.outbound.KafkaProducerMessageHandler;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.listener.AbstractMessageListenerContainer;
import org.springframework.kafka.test.rule.EmbeddedKafkaRule;
import org.springframework.messaging.MessageChannel;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Artem Bilan
 * @author Oleg Zhurakousky
 * @author Jon Schneider
 * @author Gary Russell
 * @author Soby Chacko
 *
 * @since 2.0
 */
@RunWith(SpringRunner.class)
// @checkstyle:off
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE,
		properties = {
		"spring.cloud.stream.bindings.input.group=" + KafkaBinderActuatorTests.TEST_CONSUMER_GROUP,
		"spring.cloud.stream.function.bindings.process-in-0=input",
		"spring.cloud.stream.pollable-source=input"}
)
// @checkstyle:on
@DirtiesContext
public class KafkaBinderActuatorTests {

	static final String TEST_CONSUMER_GROUP = "testGroup-actuatorTests";

	private static final String KAFKA_BROKERS_PROPERTY = "spring.kafka.bootstrap-servers";

	@ClassRule
	public static EmbeddedKafkaRule kafkaEmbedded = new EmbeddedKafkaRule(1, true);

	@BeforeClass
	public static void setup() {
		System.setProperty(KAFKA_BROKERS_PROPERTY,
				kafkaEmbedded.getEmbeddedKafka().getBrokersAsString());
	}

	@AfterClass
	public static void clean() {
		System.clearProperty(KAFKA_BROKERS_PROPERTY);
	}

	@Autowired
	private MeterRegistry meterRegistry;

	@Autowired
	private KafkaTemplate<?, byte[]> kafkaTemplate;

	@Test
	public void testKafkaBinderMetricsExposed() {
		this.kafkaTemplate.send("input", null, "foo".getBytes());
		this.kafkaTemplate.flush();

		assertThat(this.meterRegistry.get("spring.cloud.stream.binder.kafka.offset")
				.tag("group", TEST_CONSUMER_GROUP).tag("topic", "input").gauge()
				.value()).isGreaterThan(0);
	}

	@Test
	@Ignore
	public void testKafkaBinderMetricsWhenNoMicrometer() {
		new ApplicationContextRunner().withUserConfiguration(KafkaMetricsTestConfig.class)
				.withPropertyValues(
						"spring.cloud.stream.bindings.input.group", KafkaBinderActuatorTests.TEST_CONSUMER_GROUP,
						"spring.cloud.stream.function.bindings.process-in-0", "input",
						"spring.cloud.stream.pollable-source", "input")
				.withClassLoader(new FilteredClassLoader("io.micrometer.core"))
				.run(context -> {
					assertThat(context.getBeanNamesForType(MeterRegistry.class))
							.isEmpty();
					assertThat(context.getBeanNamesForType(MeterBinder.class)).isEmpty();

					DirectFieldAccessor channelBindingServiceAccessor = new DirectFieldAccessor(
							context.getBean(BindingService.class));
					@SuppressWarnings("unchecked")
					Map<String, List<Binding<MessageChannel>>> consumerBindings =
						(Map<String, List<Binding<MessageChannel>>>) channelBindingServiceAccessor
							.getPropertyValue("consumerBindings");
					assertThat(new DirectFieldAccessor(
							consumerBindings.get("input").get(0)).getPropertyValue(
									"lifecycle.messageListenerContainer.beanName"))
											.isEqualTo("setByCustomizer:input");
					assertThat(new DirectFieldAccessor(
							consumerBindings.get("input").get(0)).getPropertyValue(
									"lifecycle.beanName"))
											.isEqualTo("setByCustomizer:input");
					assertThat(new DirectFieldAccessor(
							consumerBindings.get("source").get(0)).getPropertyValue(
									"lifecycle.beanName"))
											.isEqualTo("setByCustomizer:source");

					@SuppressWarnings("unchecked")
					Map<String, Binding<MessageChannel>> producerBindings =
						(Map<String, Binding<MessageChannel>>) channelBindingServiceAccessor
							.getPropertyValue("producerBindings");

					assertThat(new DirectFieldAccessor(
							producerBindings.get("output")).getPropertyValue(
							"lifecycle.beanName"))
							.isEqualTo("setByCustomizer:output");
				});
	}

	@EnableAutoConfiguration
	@Configuration
	public static class KafkaMetricsTestConfig {

		@Bean
		public ListenerContainerCustomizer<AbstractMessageListenerContainer<?, ?>> containerCustomizer() {
			return (c, q, g) -> c.setBeanName("setByCustomizer:" + q);
		}

		@Bean
		public MessageSourceCustomizer<KafkaMessageSource<?, ?>> sourceCustomizer() {
			return (s, q, g) -> s.setBeanName("setByCustomizer:" + q);
		}

		@Bean
		public ConsumerEndpointCustomizer<KafkaMessageDrivenChannelAdapter<?, ?>> consumerCustomizer() {
			return (p, q, g) -> p.setBeanName("setByCustomizer:" + q);
		}

		@Bean
		public ProducerMessageHandlerCustomizer<KafkaProducerMessageHandler<?, ?>> handlerCustomizer() {
			return (handler, destinationName) -> handler.setBeanName("setByCustomizer:" + destinationName);
		}

		@Bean
		public Consumer<String> process() {
			// Artificial slow listener to emulate consumer lag
			return s -> {
				try {
					Thread.sleep(1000);
				}
				catch (InterruptedException e) {
					//no-op
				}
			};
		}

	}
}
