/*
 * Copyright 2021-2021 the original author or authors.
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

package org.springframework.cloud.stream.binder.kafka.streams.bootstrap;

import java.util.function.Consumer;

import javax.security.auth.login.AppConfigurationEntry;

import org.apache.kafka.common.security.JaasUtils;
import org.apache.kafka.streams.kstream.KStream;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.test.rule.EmbeddedKafkaRule;

import static org.assertj.core.api.Assertions.assertThat;

public class KafkaStreamsBinderJaasInitTests {

	@ClassRule
	public static EmbeddedKafkaRule embeddedKafka = new EmbeddedKafkaRule(1, true, 10);

	private static String JAVA_LOGIN_CONFIG_PARAM_VALUE;

	@BeforeClass
	public static void beforeAll() {
		JAVA_LOGIN_CONFIG_PARAM_VALUE = System.getProperty(JaasUtils.JAVA_LOGIN_CONFIG_PARAM);
		System.clearProperty(JaasUtils.JAVA_LOGIN_CONFIG_PARAM);
	}

	@AfterClass
	public static void afterAll() {
		if (JAVA_LOGIN_CONFIG_PARAM_VALUE != null) {
			System.setProperty(JaasUtils.JAVA_LOGIN_CONFIG_PARAM, JAVA_LOGIN_CONFIG_PARAM_VALUE);
		}
	}

	@Test
	public void testKafkaStreamsBinderJaasInitialization() {
		ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(
				KafkaStreamsBinderJaasInitTestsApplication.class).web(WebApplicationType.NONE).run(
				"--spring.cloud.function.definition=foo",
				"--spring.cloud.stream.kafka.streams.bindings.foo-in-0.consumer.application-id"
						+ "=testKafkaStreamsBinderJaasInitialization-jaas-id",
				"--spring.cloud.stream.kafka.streams.binder.jaas.loginModule=org.apache.kafka.common.security.plain.PlainLoginModule",
				"--spring.cloud.stream.kafka.streams.binder.jaas.options.username=foo",
				"--spring.cloud.stream.kafka.streams.binder.jaas.options.password=bar",
				"--spring.cloud.stream.kafka.streams.binder.brokers="
						+ embeddedKafka.getEmbeddedKafka().getBrokersAsString());
		javax.security.auth.login.Configuration configuration = javax.security.auth.login.Configuration
				.getConfiguration();
		final AppConfigurationEntry[] kafkaConfiguration = configuration
				.getAppConfigurationEntry("KafkaClient");
		assertThat(kafkaConfiguration).hasSize(1);
		assertThat(kafkaConfiguration[0].getOptions().get("username")).isEqualTo("foo");
		assertThat(kafkaConfiguration[0].getOptions().get("password")).isEqualTo("bar");
		assertThat(kafkaConfiguration[0].getControlFlag())
				.isEqualTo(AppConfigurationEntry.LoginModuleControlFlag.REQUIRED);
		applicationContext.close();
	}

	@SpringBootApplication
	static class KafkaStreamsBinderJaasInitTestsApplication {

		@Bean
		public Consumer<KStream<Object, String>> foo() {
			return s -> {
				// No-op consumer
			};
		}
	}
}
