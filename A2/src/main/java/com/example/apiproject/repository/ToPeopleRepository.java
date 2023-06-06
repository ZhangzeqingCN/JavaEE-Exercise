package com.example.apiproject.repository;

import com.example.apiproject.access.ToPeople;
import com.example.apiproject.access.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ToPeopleRepository extends JpaRepository<ToPeople,String> {

    Optional<ToPeople> findByUser(User user);

    void deleteById(@NotNull Integer id);

    boolean existsById(Integer id);
}
