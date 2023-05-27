package com.example.a2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages={"com.example.a2.repository"})
public class A2Application {

    public static void main(String[] args) {
        SpringApplication.run(A2Application.class, args);
    }

}