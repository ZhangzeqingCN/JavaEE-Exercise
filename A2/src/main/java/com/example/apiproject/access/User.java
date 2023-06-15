package com.example.apiproject.access;

import jakarta.persistence.*;
import lombok.*;


@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "t_User")
public class User {
    @Id
    String name;
    String password;
    @Builder.Default
    Gender gender = Gender.Unknown;
    String email;
    String phone;//根据电话查自己名下包裹
    String address;//收货地址？
}
