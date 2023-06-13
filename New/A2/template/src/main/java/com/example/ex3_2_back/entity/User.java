package com.example.ex3_2_back.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "t_User")
@Schema(description = "User")
public class User {
    @Id
    @Schema(defaultValue = "ZZQ")
    String name;
    @Schema(defaultValue = "123")
    String password;
    @Schema(defaultValue = "男")
    @Builder.Default
    Gender gender = Gender.Unknown;
    @Email
    @Schema(defaultValue = "1804924578@qq.com")
    String email;
    @Schema(defaultValue = "18810393672")
    String phone;
    @Schema(defaultValue = "北京市海淀区北京交通大学")
    String address;
}
