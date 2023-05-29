package com.example.apiproject.repository;

import com.example.apiproject.access.Commodity;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
@Slf4j
public class CommodityRepositoryTests {

    private CommodityRepository commodityRepository;

    @Autowired
    public void setCommodityRepository(CommodityRepository commodityRepository) {
        this.commodityRepository = commodityRepository;
    }

    @Test
    public void testFindAll() {
        log.info(Arrays.toString(commodityRepository.findAll().toArray()));
    }
}
