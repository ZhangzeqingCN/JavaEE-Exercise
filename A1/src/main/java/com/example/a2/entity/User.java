package com.example.a2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_user")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id; // 用户Id
    @Column(unique = true)
    String name;
    String password;
    Gender gender = Gender.Unknown;
    @Transient
    String token;
}
