package com.example.apiproject.service;

import com.example.apiproject.domain.Result;
import com.example.apiproject.domain.order.*;
import com.example.apiproject.repository.ShipRepository;
import com.example.apiproject.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther HYT
 * @Date 2023/6/5
 * @Desc
 */
@Service
@Slf4j
public class OrderService {
    private ShipRepository shipRepository;

    @Autowired
    public void setUserRepository(ShipRepository shipRepository) {
        this.shipRepository = shipRepository;
    }

    public Result addNewOrder(@NotNull addNewOrderDomain addNewOrderDomain){
        return Result.success();
    }
}
