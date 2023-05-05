package com.example.a2.initializer;

import com.example.a2.entity.User;
import com.example.a2.entity.Shipment;
import com.example.a2.repository.UserRepository;
import com.example.a2.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 数据库初始化
 */
@Component
public class DataSourceInitializer implements CommandLineRunner {

    UserRepository userRepository;


    ShipmentRepository shipmentRepository;


    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setShipmentRepository(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 100; i++) {
            var user = User.builder()
                    .id(i)
                    .name(String.valueOf(i))
                    .password(String.valueOf(i))
                    .build();
            userRepository.save(user);
        }

        userRepository.save(User.builder().id(1).name("ZZQ").build());

        var user = User.builder().name("hyt").password("123").build();
        userRepository.save(user);
        for (int i = 0; i < 20; i++) {
            var ship = Shipment.builder()
                    .id(i)
                    .fromUser(user)
                    .toUser(user)
                    .fromAddress(String.valueOf(i * 4))
                    .toAddress(String.valueOf(i * 4))
                    .toPhone("12344")
                    .fromPhone("189740")
                    .parcelTrace(String.valueOf(i * 5))
                    .build();

            shipmentRepository.save(ship);

        }
    }
}

