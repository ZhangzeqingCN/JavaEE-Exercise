package com.example.testsecurity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity(name = "t_User")
public class MyUser {
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
