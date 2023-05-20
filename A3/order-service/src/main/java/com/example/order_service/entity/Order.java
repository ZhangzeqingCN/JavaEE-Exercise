package com.example.order_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity(name = "t_Order")
public class Order {
    @Id
    String id;
    String name;
    Integer age;
    String address;
    String email;
    String phone;
    String password;
    String role;
}
