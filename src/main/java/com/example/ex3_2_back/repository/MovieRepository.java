package com.example.ex3_2_back.repository;

import com.example.ex3_2_back.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
