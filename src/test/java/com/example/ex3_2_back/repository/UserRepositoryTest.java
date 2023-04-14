package com.example.ex3_2_back.repository;

import org.junit.jupiter.api.Test;
import com.example.ex3_2_back.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
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