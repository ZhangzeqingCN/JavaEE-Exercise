package com.example.apiproject.repository;

import com.example.apiproject.access.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommodityRepository extends JpaRepository<Commodity, Integer> {

}
