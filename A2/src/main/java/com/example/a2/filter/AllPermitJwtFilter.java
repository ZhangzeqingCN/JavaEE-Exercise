package com.example.a2.filter;

import com.example.a2.condition.TrueCondition;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Conditional(TrueCondition.class)
@Component
@Slf4j
public class AllPermitJwtFilter extends JwtFilter{

    public AllPermitJwtFilter() {
        System.err.println(getClass().getName());
    }

    @Override
    protected void doFilterInternal(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response, @NotNull FilterChain filterChain) throws ServletException, IOException {
        filterChain.doFilter(request, response);
    }
}
