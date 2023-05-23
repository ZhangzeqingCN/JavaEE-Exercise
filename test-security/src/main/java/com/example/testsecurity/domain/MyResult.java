package com.example.testsecurity.domain;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class MyResult {
    private boolean success;
    private Integer code;
    private String message;
    private Object data;
    private final List<Object> errors = new ArrayList<>();
}
