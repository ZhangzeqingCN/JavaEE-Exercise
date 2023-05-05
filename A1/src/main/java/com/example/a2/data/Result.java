package com.example.a2.data;

import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Result<Data> {
    boolean success;
    String message;
    Data data;

    public Result(boolean b, String message) {
        this(b, message, null);
    }
}
