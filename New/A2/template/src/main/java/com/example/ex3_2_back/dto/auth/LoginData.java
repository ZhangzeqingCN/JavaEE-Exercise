package com.example.ex3_2_back.dto.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoginData {
    public static final String testToken = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhdXRoZW50aWNhdGlvbiIsInQtdXNlcm5hbWUiOiJaWlEiLCJpc3MiOiJpc3N1ZXIiLCJleHAiOjM4MzQwNjU1NDYsImlhdCI6MTY4NjU4MTg5OX0.YlalGUUUR1bnz4u1ZRA_l8NCqOgXCV17P3sTuGCYoN8";
    @Schema(defaultValue = testToken)
    String token;
    @Schema(defaultValue = testToken)
    String refreshToken;
}
