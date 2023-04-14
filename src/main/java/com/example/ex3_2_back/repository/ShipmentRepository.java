package com.example.ex3_2_back.repository;

import com.example.ex3_2_back.entity.Movie;
import com.example.ex3_2_back.entity.Shipment;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.ex3_2_back.entity.Shipment;
import com.example.ex3_2_back.entity.User;
import java.util.List;
import java.util.Optional;

public interface ShipmentRepository extends JpaRepository<Shipment, Integer> {
    Optional<Shipment> findById(String id);

    boolean existsByFromUser(User user);

    boolean existsByToUser(User user);

    List<Shipment> findByFromUser(User fromUser);

    List<Shipment> findByToUser(User toUser);

//    @Query(value = "from Shipment m order by m.id, m.fromUser, m.toUser")
//    List<Shipment> myFind();
}
