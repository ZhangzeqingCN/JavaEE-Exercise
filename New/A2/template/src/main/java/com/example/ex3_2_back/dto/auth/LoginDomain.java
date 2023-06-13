package com.example.ex3_2_back.dto.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoginDomain {
    @NotBlank
    @Schema(description = "username", defaultValue = "ZZQ", requiredMode = Schema.RequiredMode.REQUIRED)
    String username;
    @NotBlank
    @Schema(description = "password", defaultValue = "123", requiredMode = Schema.RequiredMode.REQUIRED)
    String password;
}
