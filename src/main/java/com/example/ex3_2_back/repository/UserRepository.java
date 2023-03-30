package com.example.ex3_2_back.repository;

import com.example.ex3_2_back.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByIdAndName(int id, String name);
}
