package com.example.apiproject.access;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {
    Unknown(0),
    Male(1),
    Female(2);

    final int code;

    @JsonValue
    String toJsonValue() {
        return switch (this) {
            case Unknown -> "未知";
            case Male -> "男";
            case Female -> "女";
        };
    }
}
