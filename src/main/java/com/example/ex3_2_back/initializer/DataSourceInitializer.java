package com.example.ex3_2_back.initializer;

import com.example.ex3_2_back.entity.Movie;
import com.example.ex3_2_back.entity.User;
import com.example.ex3_2_back.repository.MovieRepository;
import com.example.ex3_2_back.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSourceInitializer implements CommandLineRunner {

    UserRepository userRepository;

    MovieRepository movieRepository;

    @Autowired
    public void setMovieRepository(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    void initializeUsers() {
        for (int i = 0; i < 100; i++) {
            var user = User.builder()
                    .id(i)
                    .name(String.valueOf(i))
                    .password(String.valueOf(i))
                    .build();
            userRepository.save(user);
        }

        userRepository.save(User.builder().name("ZZQ").build());
    }

    void initializeMovies() {
        for (int i = 0; i < 100; i++) {
            var movie = Movie.builder()
                    .id(i)
                    .originalTitle(String.valueOf(i))
                    .voteAverage((float) (i * 100.0))
                    .build();
            movieRepository.save(movie);
        }
    }


    @Override
    public void run(String... args) throws Exception {
        initializeUsers();
        initializeMovies();
    }
}
