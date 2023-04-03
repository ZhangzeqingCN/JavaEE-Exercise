package com.example.ex3_2_back.repository;

import com.example.ex3_2_back.entity.Movie;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    List<Movie> findByOriginalTitle(String originalTitle);


    List<Movie> findByOrderByVoteAverage(Pageable pageable);

    @Query(value = "from Movie m order by m.voteAverage, m.originalTitle")
    List<Movie> myFind();
}
