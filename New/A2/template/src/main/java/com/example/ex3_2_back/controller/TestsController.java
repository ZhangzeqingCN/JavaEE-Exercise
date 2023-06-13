package com.example.ex3_2_back.controller;

import com.example.ex3_2_back.dto.TResult;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import static com.example.ex3_2_back.dto.auth.LoginData.testToken;

@RestController
@RequestMapping("/test")
@Tag(name = "TestsController")
public class TestsController {
    @GetMapping
    public TResult<String> getTestMessage() {
        return TResult.success("Hello");
    }

    @GetMapping("/getGreetMessageWithHeadersToken")
    public TResult<String> getGreetMessageWithHeadersToken(@RequestHeader("token") @Schema(defaultValue = testToken) String username) {
        return TResult.success("Your token " + username);
    }

    @GetMapping("/getGreetMessageWithUsernameAttribute")
    public TResult<String> getGreetMessageWithUsernameAttribute(@RequestAttribute("username") @Schema(defaultValue = "ZZQ") String username) {
        return TResult.success("Hello " + username);
    }
}
