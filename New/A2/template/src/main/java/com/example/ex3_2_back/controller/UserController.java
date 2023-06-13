package com.example.ex3_2_back.controller;

import com.example.ex3_2_back.dto.TResult;
import com.example.ex3_2_back.entity.User;
import com.example.ex3_2_back.repository.UserRepository;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
@Tag(name = "UserController")
public class UserController {
    UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/current")
    public TResult<User> getUser(@RequestAttribute("username") @Schema(defaultValue = "ZZQ") String username) {
        Optional<User> optionalUser = userRepository.findByName(username);
        if (optionalUser.isEmpty()) {
            return TResult.error("User " + username + "not found");
        } else {
            return TResult.success(optionalUser.get());
        }
    }
}
