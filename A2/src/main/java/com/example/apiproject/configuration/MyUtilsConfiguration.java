package com.example.apiproject.configuration;

import com.example.apiproject.utils.MyJwtUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyUtilsConfiguration {
    @Bean
    public MyJwtUtil jwtUtil() {
        return new MyJwtUtil();
    }
}
