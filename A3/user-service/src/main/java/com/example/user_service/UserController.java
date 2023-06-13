package com.example.user_service;

import com.example.common.dto.Result;
import com.example.common.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class UserController {
    private RestTemplate restTemplate;

    @Value("${spring.application.name}")
    private String serviceName;

    @Value("${server.port}")
    private Integer servicePort;

    @GetMapping("/")
    public String getDefaultMessage() {
        return getMessage();
    }

    @GetMapping("/{id}")
    public Result getUser(@PathVariable String id) {
        return Result.builder()
                .success(true)
                .data(User.builder()
                        .id(id)
                        .build())
                .build();
    }


    @GetMapping("/message")
    public String getMessage() {
        return String.format("This is %s:%d", serviceName, servicePort);
    }

    @GetMapping("/other-message")
    public String getOtherServiceMessage() {
        log.info("This is {}:{}", serviceName, servicePort);
        return restTemplate.getForObject("http://order-service/message", String.class);
    }

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
