package com.example.ex3_2_back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "movie")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Movie {
    @Id
    @Column(name = "movie_id")
    Integer id;
    Boolean adult = false;
    Integer budget;
    String homepage = "";
    @Column(name = "original_language")
    String originalLanguage = "";
    @Column(name = "original_title")
    String originalTitle = "";
    Float popularity = 0.0f;
    @Column(name = "poster_path")
    String posterPath = "";
    @Column(name = "release_date")
    String releaseDate = "";
    Integer revenue;
    Integer runtime;
    String status;
    String tagline;
    String title;
    @Column(name = "vote_average")
    Float voteAverage;
    @Column(name = "vote_count")
    Integer voteCount;
    String overview;
}

