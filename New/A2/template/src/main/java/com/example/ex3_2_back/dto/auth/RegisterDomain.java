package com.example.ex3_2_back.dto.auth;

import com.example.ex3_2_back.entity.Gender;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RegisterDomain {
    @NotBlank
    @Schema(defaultValue = "ZZQ")
    String username;
    @NotBlank
    @Schema(defaultValue = "123")
    String password1;
    @NotBlank
    @Schema(defaultValue = "123")
    String password2;
    @Email
    @Schema(defaultValue = "test@example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    String email;
    @Schema(defaultValue = "18810393672", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    String phone;
    @Builder.Default
    @Schema(defaultValue = "男", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    Gender gender = Gender.Unknown;
}
