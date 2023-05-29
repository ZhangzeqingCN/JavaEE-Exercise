package com.example.a2.service;

import com.example.a2.data.Result;
import com.example.a2.entity.User;
import org.jetbrains.annotations.NotNull;

public interface AuthService {
    @NotNull
    Result login(@NotNull User user);
}
