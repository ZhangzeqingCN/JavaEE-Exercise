package com.example.ex3_2_back.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestsController {
    @RequestMapping("/testMessage")
    String getTestMessage() {
        return "Hello";
    }
}
