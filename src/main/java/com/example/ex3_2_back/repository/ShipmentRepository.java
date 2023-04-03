package com.example.ex3_2_back.repository;

import com.example.ex3_2_back.entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentRepository extends JpaRepository<Shipment, Integer> {

}
