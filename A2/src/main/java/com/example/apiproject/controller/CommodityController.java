package com.example.apiproject.controller;

import com.example.apiproject.access.Commodity;
import com.example.apiproject.domain.Result;
import com.example.apiproject.repository.CommodityRepository;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commodity")
@Slf4j
public class CommodityController {

    private CommodityRepository commodityRepository;

    @Autowired
    public void setCommodityRepository(CommodityRepository commodityRepository) {
        this.commodityRepository = commodityRepository;
    }

    @PostMapping("/price")
    public Result findByPrice(@RequestBody @NotNull Float price) {
        var result = new Result();
        List<Commodity> commodityList = commodityRepository.findByPrice(price);
        result.setSuccess(true);
        result.setData(commodityList);
        return result;
    }

    @GetMapping("/of-user")
    public Result findByUsername(@NotNull HttpServletRequest request) {
        String username = request.getAttribute("username").toString();

        return Result.builder().success(true).data(username).build();
    }
}
