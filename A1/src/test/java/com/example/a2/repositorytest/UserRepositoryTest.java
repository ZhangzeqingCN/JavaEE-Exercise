package com.example.a2.repositorytest;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import com.example.a2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
@Slf4j
class UserRepositoryTest {
    UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Test
    void findById() {
        var m=userRepository.findById(1);
        System.out.println(m);
    }

    @Test
    void myFind() {
        var m=userRepository.myFind();
        System.out.println(Arrays.deepToString(m.toArray()));
    }
}