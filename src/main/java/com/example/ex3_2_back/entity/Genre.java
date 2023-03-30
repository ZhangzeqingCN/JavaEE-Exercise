package com.example.ex3_2_back.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "genre")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Genre {
    @Id
    @Column(name = "genre_id")
    Integer id;
    @OneToOne
    @JoinColumn(name = "genre_hub_id")
    GenreHub genreHub;

    @OneToOne
    @JoinColumn(name = "movie_id")
    Movie movie;
}