package com.example.ex3_2_back.repository;

import com.example.ex3_2_back.entity.Movie;
import com.example.ex3_2_back.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByIdAndName(Integer id, String name);

    Optional<User> findByNameAndPassword(String name, String password);

    Optional<User> findByIdAndPassword(Integer id, String password);

    boolean existsByNameAndPassword(String name, String password);

    @Query(value = "from User m order by m.id, m.name")
    List<User> myFind();
}
