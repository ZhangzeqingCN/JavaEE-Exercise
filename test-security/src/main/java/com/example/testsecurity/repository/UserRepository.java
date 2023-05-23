package com.example.testsecurity.repository;

import com.example.testsecurity.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<MyUser, String> {
    boolean existsByName(String name);
    Optional<MyUser> findByName(String name);
}
