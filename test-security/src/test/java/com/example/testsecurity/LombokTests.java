package com.example.testsecurity;

import com.example.testsecurity.entity.MyUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class LombokTests {
    @Test
    void contextLoads() {
        var user1 = MyUser.builder()
                .id("123123")
                .build();
        var user2 = MyUser.builder()
                .id("123123")
                .build();
        log.info(String.valueOf(user1.hashCode()));
        log.info(String.valueOf(user2.hashCode()));
        log.info(String.valueOf(user1.equals(user2)));
    }
}
