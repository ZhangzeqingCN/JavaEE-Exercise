package com.example.ex3_2_back.repositorytest;


import com.example.ex3_2_back.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class UserRepositoryTest {

    UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Test
    void nothing() {
        System.out.println("Hello");
    }

}