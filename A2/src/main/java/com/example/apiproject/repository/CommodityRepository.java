package com.example.apiproject.repository;

import com.example.apiproject.access.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "repo-commodity")
public interface CommodityRepository extends JpaRepository<Commodity, Integer> {
    List<Commodity> findByPrice(Float price);
}
