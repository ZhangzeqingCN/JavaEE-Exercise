package com.example.apiproject.controller;

import com.example.apiproject.domain.Result;
import com.example.apiproject.repository.AddressRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
@Slf4j
public class AddressController {

    private AddressRepository addressRepository;

    @Autowired
    public void setAddressRepository(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @GetMapping
    public Result all() {
        return Result.success(addressRepository.findAll());
    }

    @GetMapping("/{id}")
    public Result one(@PathVariable Integer id) {
        return Result.success(addressRepository.findById(id));
    }

}
