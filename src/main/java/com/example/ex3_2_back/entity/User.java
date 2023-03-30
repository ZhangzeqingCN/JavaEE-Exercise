package com.example.ex3_2_back.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_user")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @Column(name = "user_id")
    Integer id;
    String name;
    String password;
    Gender gender = Gender.Unknown;
    @Transient
    String token;
}
