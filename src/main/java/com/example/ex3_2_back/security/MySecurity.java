package com.example.ex3_2_back.security;


import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.ex3_2_back.entity.User;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class MySecurity {
    final Algorithm algorithm = Algorithm.HMAC256("movie");

    public String genToken(User user) {

        var calendar = Calendar.getInstance();
        var currentTime = calendar.getTime();
        calendar.add(Calendar.HOUR, 1); // 设置1小时后过期
        var expirationTime = calendar.getTime();

        return JWT.create()
                .withSubject("authentication")
                .withIssuer("your_issuer")
                .withClaim("id", user.getId())
                .withIssuedAt(currentTime)
                .withExpiresAt(expirationTime)
                .sign(algorithm);
    }

    public String genExpiredToken(User user, int millis) {

        var calendar = Calendar.getInstance();
        var currentTime = calendar.getTime();
        calendar.add(Calendar.MILLISECOND, millis); // 设置1小时后过期
        var expirationTime = calendar.getTime();

        return JWT.create()
                .withSubject("authentication")
                .withIssuer("your_issuer")
                .withClaim("id", user.getId())
                .withIssuedAt(currentTime)
                .withExpiresAt(expirationTime)
                .sign(algorithm);
    }

    public Optional<User> decToken(String token) {
        try {
            var verifier = JWT.require(algorithm).build();
            var jwt = verifier.verify(token);
            var id = jwt.getClaim("id").asInt();
            return Optional.of(User.builder().id(id).build());
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}