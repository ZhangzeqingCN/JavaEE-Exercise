package com.example.apiproject.controller;


import com.example.apiproject.domain.Result;
import jakarta.servlet.http.HttpServletRequest;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MyTestController {
    @GetMapping
    public String testMessage(@NotNull HttpServletRequest request) {
        var username = request.getAttribute("username");
        return String.format("Hello %s!", username);
    }

    @GetMapping("/error")
    public Result error() {
        throw new IllegalStateException("Error");
    }
}
