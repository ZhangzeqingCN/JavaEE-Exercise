package com.example.apiproject.repository;

import com.example.apiproject.access.FromPeople;
import com.example.apiproject.access.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FromPeopleRepository extends JpaRepository<FromPeople,Integer> {

    Optional<FromPeople> findByUser(User user);

    void deleteById(@NotNull Integer id);
}
