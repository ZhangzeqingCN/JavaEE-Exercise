package com.example.a2.config;

import com.example.a2.utils.JwtUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyUtilConfiguration {
    @Bean
    public JwtUtil getJwtUtil() {
        return new JwtUtil();
    }

}
