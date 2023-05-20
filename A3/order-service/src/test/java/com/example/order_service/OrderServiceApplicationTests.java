package com.example.order_service;

import com.example.order_service.dto.Result;
import com.example.order_service.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderServiceApplicationTests {

    @Test
    void contextLoads() {
        var result = Result.builder()
                .success(true)
                .message("No message")
                .data(User.builder()
                        .id("123")
                        .build())
                .build();

        result.setSuccess(false);
    }
}
