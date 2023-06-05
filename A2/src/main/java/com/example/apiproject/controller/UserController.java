package com.example.apiproject.controller;

import com.example.apiproject.access.User;
import com.example.apiproject.domain.Result;
import com.example.apiproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dev/commodity")
public class UserController {
    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public Result all() {
        return Result.success(userRepository.findAll());
    }

    @GetMapping("/{name}")
    public Result one(@PathVariable String name) {
        return Result.success(userRepository.findByName(name));
    }

    @PostMapping
    public Result create(@RequestBody User user) {
        try {
            userRepository.save(user);
            return Result.success();
        } catch (Exception e) {
            return Result.error(e.getMessage()).addErrors(e);
        }
    }

    @DeleteMapping("/{name}")
    public Result delete(@PathVariable String name) {
        try {
            userRepository.deleteByName(name);
            return Result.success();
        } catch (Exception e) {
            return Result.error(e.getMessage()).addErrors(e);
        }
    }

}
