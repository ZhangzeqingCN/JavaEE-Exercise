package com.example.ex3_2_back.exception;

import com.example.ex3_2_back.dto.Result;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 */
@ControllerAdvice
@Slf4j
public class MyExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result handleException(@NotNull Exception e) {
        log.error(e.getMessage(), e);
        return Result.error(e.getMessage()).addErrors(e.getClass()).addErrors(e);
    }

    @ExceptionHandler(MissingRequestHeaderException.class)
    @ResponseBody
    public Result handleMissingRequestHeaderException(@NotNull MissingRequestHeaderException e, @NotNull HttpServletResponse response) {
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        return Result.error(e.getMessage()).addErrors(e.getClass()).addErrors(e);
    }

    @ExceptionHandler(ServletRequestBindingException.class)
    @ResponseBody
    public Result handleMissingRequestHeaderException(@NotNull ServletRequestBindingException e, @NotNull HttpServletResponse response) {
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        return Result.error(e.getMessage()).addErrors(e.getClass()).addErrors(e);
    }
}
