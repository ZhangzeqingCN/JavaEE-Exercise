package com.example.user_service.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetOrderByNameDto {
    private String name;
}
