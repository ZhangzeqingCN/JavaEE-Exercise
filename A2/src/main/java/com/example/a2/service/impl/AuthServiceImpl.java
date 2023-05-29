package com.example.a2.service.impl;

import com.example.a2.data.Result;
import com.example.a2.entity.User;
import com.example.a2.repository.UserRepository;
import com.example.a2.service.AuthService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class AuthServiceImpl implements AuthService {

    private UserRepository userRepository;
    private AuthenticationManager authenticationManager;

    @Override
    @NotNull
    public Result login(@NotNull User user) {
        var authenticationToken = new UsernamePasswordAuthenticationToken(user.getName(), user.getPassword());
        authenticationManager.authenticate(authenticationToken);
        System.out.println("authenticationToken: "+authenticationToken);
        return Result.builder()
                .message("登陆成功")
                .success(true)
                .data(authenticationToken)
                .build();
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }
}