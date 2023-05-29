package com.example.apiproject.domain.auth;

import com.example.apiproject.access.Gender;
import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class RegisterDomain {
    private String username;
    private String password1;
    private String password2;
    private String email;
    private String phone;
    @Builder.Default
    private Gender gender = Gender.Unknown;
}
