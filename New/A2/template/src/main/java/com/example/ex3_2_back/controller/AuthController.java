package com.example.ex3_2_back.controller;


import com.example.ex3_2_back.dto.Result;
import com.example.ex3_2_back.dto.TResult;
import com.example.ex3_2_back.dto.auth.LoginData;
import com.example.ex3_2_back.dto.auth.LoginDomain;
import com.example.ex3_2_back.dto.auth.RegisterDomain;
import com.example.ex3_2_back.entity.User;
import com.example.ex3_2_back.repository.UserRepository;
import com.example.ex3_2_back.utils.MyJwtUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/auth")
@Slf4j
@Tag(name = "AuthController", description = "AuthController")
public class AuthController {

    UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    MyJwtUtil jwtUtil;

    @Autowired
    public void setJwtUtil(MyJwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    @NotNull
    public TResult<LoginData> login(@RequestBody @NotNull @Validated LoginDomain loginDomain) {
        if (!userRepository.existsByNameAndPassword(loginDomain.getUsername(), loginDomain.getPassword())) {
            String message = String.format("wrong username %s or password %s", loginDomain.getUsername(), loginDomain.getPassword());
            log.info(message);
            return TResult.<LoginData>error(message).addErrors(message).addErrors(loginDomain);
        }

        log.info(String.format("login username %s with password %s", loginDomain.getUsername(), loginDomain.getPassword()));
        String token = jwtUtil.createToken(loginDomain.getUsername());
        return TResult.success(LoginData.builder().token(token).build());
    }

    @PostMapping("/register")
    @Operation(summary = "注册", description = "注册")
    public Result register(@RequestBody @NotNull @Validated RegisterDomain registerDomain) {

        if (!Objects.equals(registerDomain.getPassword1(), registerDomain.getPassword2())) {
            String message = "inconsistent two passwords";
            log.info(message);
            return Result.error(message);
        }

        if (userRepository.existsByName(registerDomain.getUsername())) {
            String message = String.format("username %s already exists", registerDomain.getUsername());
            log.info(message);
            return Result.error(message).addErrors(registerDomain.getUsername());
        }

        userRepository.save(User.builder()
                .name(registerDomain.getUsername())
                .password(registerDomain.getPassword1())
                .gender(registerDomain.getGender())
                .email(registerDomain.getEmail())
                .build());

        return Result.success();
    }

}
