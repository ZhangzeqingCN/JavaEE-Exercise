package com.example.ex3_2_back.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Result {
    private boolean success;
    private String message;
    public final List<Object> errors = new ArrayList<>();

    public static Result success() {
        return Result.builder().success(true).build();
    }


    public static Result error(String message) {
        return Result.builder().success(false).message(message).build();
    }

    public static Result error() {
        return Result.builder().success(false).build();
    }

    public Result addErrors(Object error) {
        errors.add(error);
        return this;
    }

}
