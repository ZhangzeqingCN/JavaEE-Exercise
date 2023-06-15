package com.example.apiproject.repository;

import com.example.apiproject.access.Courier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourierRepository extends JpaRepository<Courier,String> {
    boolean existsByName( String name);

    Optional<Courier> findByName (String name);
}
