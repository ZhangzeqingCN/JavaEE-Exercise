package com.example.ex3_2_back.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Actor {
    @Id
    @Column(name = "actor_id")
    Integer id;
    Gender gender = Gender.Unknown;
}
