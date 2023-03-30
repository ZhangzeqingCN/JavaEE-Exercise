package com.example.ex3_2_back.controller;

import com.example.ex3_2_back.data.Result;
import com.example.ex3_2_back.entity.Movie;
import com.example.ex3_2_back.repository.MovieRepository;
import com.example.ex3_2_back.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    UserRepository userRepository;

    @Autowired
    public void setMovieRepository(MovieRepository userRepository) {
        this.movieRepository = userRepository;
    }

    MovieRepository movieRepository;

    @PostMapping
    Result<?> saveMovie(@RequestBody Movie movie) {

        if (movie.getId() < 0) {
            return new Result<>(false, "No Id");
        }

        movieRepository.save(movie);

        return new Result<>(true, "添加电影成功");

    }

    @DeleteMapping
    Result<?> deleteMovie(@RequestBody Movie movie) {
        if (!movieRepository.existsById(movie.getId())) {
            return new Result<>(false, "No Such Id");
        }

        movieRepository.deleteById(movie.getId());

        return new Result<>(true, "添加电影成功");
    }

    @GetMapping
    Result<Movie> findMovie(@RequestBody Movie movie) {

        Integer movieId = movie.getId();

        if (movieId == null) {
            return new Result<>(false, "No Id", new Movie());
        }

        Optional<Movie> byId = movieRepository.findById(movieId);

        if (byId.isEmpty()) {
            return new Result<>(false, "没有这个电影", new Movie());
        }

        return new Result<>(true, "查询成功", byId.get());

    }
}
