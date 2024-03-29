package com.example.apiproject.exceptionhandler;

import com.example.apiproject.domain.Result;
import lombok.extern.slf4j.Slf4j;
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
    public Result handleException(Exception e) {
        log.error(e.getMessage(), e);
        return Result.error(e.getMessage());
    }
}
