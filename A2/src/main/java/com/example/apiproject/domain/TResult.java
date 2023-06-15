package com.example.apiproject.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TResult<T> {
    private boolean success;
    @Schema(defaultValue = "响应消息")
    private String message;
    private T data;
    public final List<Object> errors = new ArrayList<>();

    public static <U> TResult<U> success() {
        return TResult.<U>builder().success(true).build();
    }

    public static <U> TResult<U> success(U data) {
        return TResult.<U>builder().success(true).data(data).build();
    }

    public static <U> TResult<U> error(String message) {
        return TResult.<U>builder().success(false).message(message).build();
    }

    public static <U> TResult<U> error() {
        return TResult.<U>builder().success(false).build();
    }

    public TResult<T> addErrors(Object error) {
        errors.add(error);
        return this;
    }
}
