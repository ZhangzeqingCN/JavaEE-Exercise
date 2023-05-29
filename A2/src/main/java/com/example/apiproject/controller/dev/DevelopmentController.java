package com.example.apiproject.controller.dev;

import com.example.apiproject.domain.auth.LoginDomain;
import com.example.apiproject.service.AuthService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dev")
@Slf4j
public class DevelopmentController {

    @GetMapping
    public String testMessage() {
        return "Hello!";
    }

    @PostMapping
    public Object testResponse(@RequestBody @NotNull Object body) {
        return body;
    }
}
