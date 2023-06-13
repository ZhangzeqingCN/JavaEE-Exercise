package com.example.ex3_2_back.initializer;

import com.example.ex3_2_back.entity.User;
import com.example.ex3_2_back.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


/**
 * 数据库初始化
 */
@Component
@Slf4j
public class DataSourceInitializer implements CommandLineRunner {

    UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Value("${dataInit}")
    boolean enabled = false;

    @Override
    public void run(String... args) throws Exception {

        if (!enabled) return;


        log.info("DataSourceInitializer on");

        List<User> users = new ArrayList<>();
        var user = User.builder().name("user").password("61259cdf-9cb1-4981-b926-35ebe0906c29").build();
        users.add(user);
        users.add(User.builder().name("Test").password("Test").build());
        users.add(User.builder().name("ZZQ").password("123").build());
        users.add(User.builder().name("zzq").password("123").build());

        userRepository.saveAll(users);


    }
}

