package com.example.apiproject.repository;

import com.example.apiproject.access.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-address")
public interface AddressRepository extends JpaRepository<Address, Integer> {
}