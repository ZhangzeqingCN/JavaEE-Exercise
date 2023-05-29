package com.example.apiproject.service;

import com.example.apiproject.domain.DevMessage;
import com.example.apiproject.domain.Result;
import com.example.apiproject.domain.auth.LoginDomain;
import com.example.apiproject.domain.auth.RegisterDomain;
import com.example.apiproject.access.User;
import com.example.apiproject.repository.UserRepository;
import com.example.apiproject.utils.MyJwtUtil;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

/**
 * @apiNote 用于用户权限的识别
 */
@Service
@Slf4j
public class AuthService {
    private UserRepository userRepository;

    private MyJwtUtil jwtUtil;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setJwtUtil(MyJwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @NotNull
    public Result login(@NotNull LoginDomain loginDomain, @NotNull HttpServletResponse response) {
        if (!userRepository.existsByNameAndPassword(loginDomain.getUsername(), loginDomain.getPassword())) {
            String message = String.format("wrong username %s or password %s", loginDomain.getUsername(), loginDomain.getPassword());
            log.info(message);
            return Result.error(message).addErrors(message).addDevMessages(new DevMessage(loginDomain));
        }

        log.info(String.format("login username %s with password %s", loginDomain.getUsername(), loginDomain.getPassword()));

        setTokenCookie(loginDomain.getUsername(), response);

        return Result.success();
    }

    @NotNull
    public Result register(@NotNull RegisterDomain registerDomain) {

        if (userRepository.existsByName(registerDomain.getUsername())) {
            String message = String.format("username %s already exists", registerDomain.getUsername());
            log.info(message);
            return Result.error(message).addErrors(registerDomain.getUsername());
        }

        if (!Objects.equals(registerDomain.getPassword1(), registerDomain.getPassword2())) {
            String message = "inconsistent two passwords";
            log.info(message);
            return Result.error(message);
        }

        userRepository.save(User.builder()
                .name(registerDomain.getUsername())
                .password(registerDomain.getPassword1())
                .gender(registerDomain.getGender())
                .build());

        return Result.success();
    }

    /**
     * 设置token
     *
     * @param username 用户名
     * @param response 当次的响应
     */
    public void setTokenCookie(String username, @NotNull HttpServletResponse response) {
        String token = jwtUtil.createToken(username);
        log.info(String.format("new token for %s: %s", username, token));
        var cookie = new Cookie("token", token);
        cookie.setPath("/");
        cookie.setMaxAge(30000000);
        response.addCookie(cookie);
    }

    /**
     * 清除token
     *
     * @param response 当次的响应
     */
    public void removeTokenCookie(@NotNull HttpServletResponse response) {
        var cookie = new Cookie("token", "");
        cookie.setPath("/");
        cookie.setMaxAge(30000000);
        response.addCookie(cookie);
    }

    /**
     * 检查token的有效性并更新token
     *
     * @param request  当次的请求
     * @param response 当次的响应
     * @return 结果
     */
    @NotNull
    public Result validateAndUpdateToken(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response) {
        var cookies = request.getCookies();

        if (cookies == null || cookies.length == 0) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            var message = String.format("%s: No token in cookie", request.getRequestURL());
            log.info(message);
            return Result.error(message);
        }

        Optional<Cookie> optionalCookie = Arrays.stream(cookies).filter(cookie -> cookie.getName().equals("token")).findAny();
        String token = optionalCookie.map(Cookie::getValue).orElse("");

        log.info(String.format("old token: %s", token));
        var optionalUsername = jwtUtil.decodeToken(token);

        if (optionalUsername.isEmpty()) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            var message = String.format("%s: No username in token", request.getRequestURL());
            log.info(message);
            return Result.error(message);
        }

        var username = optionalUsername.get();
        request.setAttribute("username", username);
        setTokenCookie(username, response);

        return Result.success();
    }
}
