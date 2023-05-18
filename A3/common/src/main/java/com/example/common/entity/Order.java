package com.example.common.entity;

import lombok.*;

@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Order {
    String name;
    Integer age;
    String address;
    String email;
    String phone;
    String password;
    String role;
    String id;
}
