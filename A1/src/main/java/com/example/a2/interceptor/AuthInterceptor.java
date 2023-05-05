package com.example.a2.interceptor;


import com.example.a2.security.MySecurity;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;
import java.util.Random;

@Slf4j
@Component
public class AuthInterceptor implements HandlerInterceptor {

    MySecurity mySecurity = new MySecurity();

    Random random = new Random();

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String token = null;
        log.info("---enter---");
        var cookies = request.getCookies();
        if (cookies != null) {
            for (var cookie : cookies) {
                if (Objects.equals(cookie.getName(), "token")) {
                    token = cookie.getValue();
                    break;
                }
            }
        }

        if (token == null) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            log.info("nonToken");
            response.sendRedirect("/login");
            return false;
        }

        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}


