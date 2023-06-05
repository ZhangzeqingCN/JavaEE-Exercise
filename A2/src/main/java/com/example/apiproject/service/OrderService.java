package com.example.apiproject.service;

import com.example.apiproject.domain.Result;
import com.example.apiproject.domain.order.*;
import com.example.apiproject.repository.ShipRepository;
import com.example.apiproject.repository.UserRepository;
import com.example.apiproject.utils.MyJwtUtil;
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

    private MyJwtUtil jwtUtil;

    @Autowired
    public void setUserRepository(ShipRepository shipRepository) {
        this.shipRepository = shipRepository;
    }

    @Autowired
    public void setJwtUtil(MyJwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    public Result addNewOrder(@NotNull addNewOrderDomain addNewOrderDomain){
        return Result.success();
    }
}
