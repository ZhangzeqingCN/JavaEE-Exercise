package com.example.apiproject.repository;

import com.example.apiproject.access.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

//DAO
//<表名，主键>
@RepositoryRestResource(path = "repo-user")
public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByName(String name);

    Optional<User> findByNameAndPassword(String name, String password);

    boolean existsByName(String name);

    boolean existsByNameAndPassword(String name, String password);

    void deleteByName(String name);
}
