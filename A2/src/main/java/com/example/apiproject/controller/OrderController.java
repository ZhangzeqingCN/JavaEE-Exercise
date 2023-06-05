package com.example.apiproject.controller;

import com.example.apiproject.domain.Result;
import com.example.apiproject.domain.order.*;
import com.example.apiproject.service.AuthService;
import com.example.apiproject.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther HYT
 * @Date 2023/6/5
 * @Desc
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    private OrderService orderService;

    @Autowired
    public void setOrderService(OrderService orderService) { this.orderService = orderService; }

    @PatchMapping("/addNewOrder")
    public Result addNewOrder(@RequestBody addNewOrderDomain addNewOrderDomain){
        return orderService.addNewOrder(addNewOrderDomain);
    }
}
