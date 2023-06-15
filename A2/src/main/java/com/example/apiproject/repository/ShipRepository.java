package com.example.apiproject.repository;

import com.example.apiproject.access.User;
import com.example.apiproject.access.shipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ShipRepository extends JpaRepository<shipment, Integer> {
    Optional<shipment> findById(Integer id);

  //  Optional<shipment> findByFromPhone(String fromPhone);

    List<shipment> findByFromPhone(String phone);

    List<shipment> findByToPhone(String phone);

   // Optional<shipment> findByToPhone(String toPhone);

    boolean existsById(Integer id);
}
