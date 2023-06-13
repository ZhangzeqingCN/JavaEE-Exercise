package com.example.apiproject.repository;

import com.example.apiproject.access.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-shipment")
public interface ShipmentRepository extends JpaRepository<Shipment, Integer> {
}