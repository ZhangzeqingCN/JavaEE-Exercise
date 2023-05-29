package com.example.a2.filter;

import com.example.a2.condition.FalseCondition;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;
import com.example.a2.utils.JwtUtil;

import javax.security.sasl.AuthenticationException;
import java.io.IOException;
import java.nio.file.AccessDeniedException;

@Conditional(FalseCondition.class)
@Component
@Slf4j
public class JwtFilter extends OncePerRequestFilter {

    /**
     * 该拦截器负责处理token
     */
    private JwtUtil jwtUtil;

    public JwtFilter() {
        System.err.println(getClass().getName());
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String token = request.getHeader("token");

        if (!StringUtils.hasText(token)) {
            log.info("token is empty");

            if (token == null) {
                log.error("null token");
                return;
            }

            try {
                var user = jwtUtil.decodeToken(token);
                log.info(user.getName());
            } catch (Exception e) {
                log.error("invalid token");
                return;
            }

            return;
        }

        try {
            filterChain.doFilter(request, response);
        } catch (AccessDeniedException | AuthenticationException e) {
            log.error(e.getMessage());
        }
    }

    @Autowired
    public void setJwtUtil(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }
}
