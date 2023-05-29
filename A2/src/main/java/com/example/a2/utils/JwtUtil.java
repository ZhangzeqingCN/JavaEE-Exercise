package com.example.a2.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.example.a2.entity.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Map;

@Component
public class JwtUtil {

    public static final Algorithm algorithm = Algorithm.HMAC256("default");

    @NotNull
    public String createToken(@NotNull User user, Map<String,Object> headers,int seconds){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, seconds);
        return JWT.create()
                .withHeader(headers)
                .withClaim("username", user.getName())
                .withExpiresAt(calendar.getTime())
                .sign(algorithm);
    }

    @NotNull
    public String createToken(@NotNull User user,Map<String,Object> headers){
        return createToken(user, headers, 300);
    }

    @NotNull
    public String createToken(@NotNull User user) {
        return createToken(user, null);
    }

    @NotNull
    public String createToken(@NotNull User user, int seconds) {
        return createToken(user, null, seconds);
    }

    @NotNull
    public User decodeToken(@NotNull String token) {
        JWTVerifier verifier = JWT.require(algorithm).build();
        DecodedJWT decodedJWT = verifier.verify(token);
        String name = decodedJWT.getClaim("username").asString();
        return User.builder().name(name).build();
    }
}
