package com.example.common.dto;

import lombok.*;

@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Result {
    boolean success;
    String message;
    Object data;
}
