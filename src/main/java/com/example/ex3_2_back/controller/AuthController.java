package com.example.ex3_2_back.controller;


import com.example.ex3_2_back.data.Result;
import com.example.ex3_2_back.entity.User;
import com.example.ex3_2_back.repository.UserRepository;
import com.example.ex3_2_back.security.MySecurity;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController("/auth")
public class AuthController {

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    UserRepository userRepository;

    @Autowired
    public void setMySecurity(MySecurity mySecurity) {
        this.mySecurity = mySecurity;
    }

    MySecurity mySecurity;

    @PostMapping("/register")
    Result<?> register(@RequestBody User user) {

        Optional<User> optUserInDB = userRepository.findById(user.getId());

        if (optUserInDB.isPresent()) {
            return new Result<>(false, "该用户已存在");
        }

        userRepository.save(user);

        return new Result<>(true, "注册成功");

    }



    @PostMapping("/login")
    Result<String> login(@RequestBody User user, HttpServletResponse response) {

        Optional<User> optUserInDB = userRepository.findByIdAndName(user.getId(), user.getName());

        if (optUserInDB.isEmpty()) {
            return new Result<>(false, "Id或者密码错误", "");
        }

        // 数据库session逻辑

        String newToken = mySecurity.genToken(new User());
        var tokenCookie = new Cookie("token", newToken);
        tokenCookie.setMaxAge(36000);
        response.addCookie(tokenCookie);
        response.addHeader("Access-Control-Allow-Credentials", String.valueOf(true));

        return new Result<>(true, "登陆成功", mySecurity.genToken(user));

    }

    @PostMapping("/isTokenValid")
    Result testToken(@RequestBody String token) {

        Optional<User> optionalUser = mySecurity.decToken(token);

        if (optionalUser.isEmpty()) {
            return new Result(false, "token无效");
        }

        return new Result(true, "token有效");
    }
}
