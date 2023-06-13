package com.example.apiproject.repository;

import com.example.apiproject.access.Purchasing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-purchasing")
public interface PurchasingRepository extends JpaRepository<Purchasing, Integer> {
}