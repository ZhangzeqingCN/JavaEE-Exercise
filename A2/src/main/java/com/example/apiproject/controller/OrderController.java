package com.example.apiproject.controller;

import com.example.apiproject.domain.Result;
import com.example.apiproject.domain.order.*;
import com.example.apiproject.service.AuthService;
import com.example.apiproject.service.OrderService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addOrder")
    public Result addNewOrder(@RequestBody addNewOrderDomain addNewOrderDomain,HttpServletRequest request){
        return orderService.addNewOrder(addNewOrderDomain,request);
    }

    @GetMapping("/checkOrderByShipmentCode/{ShipmentCode}")
    public Result checkOrderByShipmentCode(@PathVariable("ShipmentCode") String ShipmentCode){
        return orderService.checkOrderByShipmentCode(ShipmentCode);
    }

    @GetMapping("/getAllOrders")
    public Result getAllOrders( HttpServletRequest request){
        return orderService.getAllOrders(request);
    }

    @GetMapping("/showOrderDetail/{ShipmentCode}")
    public Result addOrder(@PathVariable("ShipmentCode") String shipmentCode){
        return orderService.showOrderDetail(shipmentCode);
    }
}
