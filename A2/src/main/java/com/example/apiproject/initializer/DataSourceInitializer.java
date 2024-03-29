package com.example.apiproject.initializer;

import com.example.apiproject.access.Commodity;
import com.example.apiproject.access.User;
import com.example.apiproject.repository.CommodityRepository;
import com.example.apiproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据库初始化
 */
@Component
public class DataSourceInitializer implements CommandLineRunner {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private CommodityRepository commodityRepository;

    @Autowired
    public void setCommodityRepository(CommodityRepository commodityRepository) {
        this.commodityRepository = commodityRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // users

        final int initialUserNumber = 100;
        List<User> users = new ArrayList<>(initialUserNumber);
        users.add(User.builder().name("zzq").password("123").phone("14793898634").build());
        for (int i = 0; i < initialUserNumber; i++) {
            users.add(User.builder().name("user" + i).password(String.valueOf(i)).build());
        }
        userRepository.saveAll(users);

        // commodities
//        commodityRepository.save(Commodity.builder().price(0.2F).name("Test").build());
//
//        final int initialCommodityNumber = 500;
//        List<Commodity> commodities = new ArrayList<>(initialCommodityNumber);
//        for (int i = 0; i < initialCommodityNumber; i++) {
//            commodities.add(Commodity.builder().name("commodity" + i).build());
//        }
//        commodityRepository.saveAll(commodities);


    }
}

