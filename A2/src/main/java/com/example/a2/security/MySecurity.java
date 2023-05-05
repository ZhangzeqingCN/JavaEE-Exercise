package com.example.a2.security;


import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.a2.entity.User;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class MySecurity {
    final Algorithm algorithm = Algorithm.HMAC256("movie");

    public String genToken(User user) {
        return genExpiredToken(user, 60 * 1000);
    }

    public String genExpiredToken(User user, int millis) {
        return genExpiredToken(user, Calendar.MILLISECOND, millis);
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

    public String genExpiredToken(User user, int calendarField, int amount) {
        var calendar = Calendar.getInstance();
        var currentTime = calendar.getTime();
        calendar.add(calendarField, amount);
        var expirationTime = calendar.getTime();

        return JWT.create()
                .withSubject("authentication")
                .withIssuer("your_issuer")
                .withClaim("id", user.getId())
                .withIssuedAt(currentTime)
                .withExpiresAt(expirationTime)
                .sign(algorithm);
    }
}