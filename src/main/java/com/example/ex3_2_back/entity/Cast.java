package com.example.ex3_2_back.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_cast")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cast {
    @Id
    @Column(name = "cast_id")
    Integer id;
    @Column(name = "cast_order")
    Integer order;
    @OneToOne
    @JoinColumn(name = "actor_id")
    Actor actor;
    @OneToOne
    @JoinColumn(name = "movie_id")
    Movie movie;
    @Column(name = "cast_character")
    String character;
    @Column(name = "profile_path")
    String profilePath;
}