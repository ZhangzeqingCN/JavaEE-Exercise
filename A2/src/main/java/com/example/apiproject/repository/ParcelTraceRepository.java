package com.example.apiproject.repository;

import com.example.apiproject.access.ParcelTrace;
import com.example.apiproject.access.shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface ParcelTraceRepository extends JpaRepository<ParcelTrace, Integer> {
    //按包裹查找
    List<ParcelTrace> findByShipment(shipment ship);

}
