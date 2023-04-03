package com.example.ex3_2_back.repositorytest;

import com.example.ex3_2_back.entity.Movie;
import com.example.ex3_2_back.repository.MovieRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class MovieRepositoryTest {

    MovieRepository movieRepository;

    @Autowired
    public void setMovieRepository(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @BeforeEach
    public void setUp() throws Exception {
//        for (int i = 0; i < 100; i++) {
//            movieRepository.save(Movie.builder().id(i).voteAverage(Float.valueOf(i)).build());
//        }
    }

    @Test
    public void testFindByOrderByVoteAverage() {
        List<Movie> movies = movieRepository.findByOrderByVoteAverage(PageRequest.of(0, 10));
        System.out.println(Arrays.deepToString(movies.toArray()));
    }

    @Test
    public void testFindBy(){
        var m=movieRepository.myFind();
        System.out.println(Arrays.deepToString(m.toArray()));
    }

}
