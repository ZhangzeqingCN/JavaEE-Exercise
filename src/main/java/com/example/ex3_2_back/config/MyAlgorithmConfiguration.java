package com.example.ex3_2_back.config;

import com.example.ex3_2_back.algorithm.MyAlgorithm;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAlgorithmConfiguration {
    @Bean
    public MyAlgorithm getTestAlgorithm() {
        return new MyAlgorithm();
    }

}