package com.example.a2.repositorytest;

import com.example.a2.entity.Shipment;
import com.example.a2.entity.User;
import com.example.a2.repository.ShipmentRepository;
import com.example.a2.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
@Slf4j
public class ShipmentRepositoryTest {
    ShipmentRepository shipmentRepository;
    UserRepository userRepository;

    User user2 = User.builder().id(1).name("Test 2").build();
    User user1 = User.builder().id(1).name("Test 1").build();

    @Test
    void saveUser1AndUser2() {
        userRepository.save(user1);
        userRepository.save(user2);
    }

    public void setup() {
        log.info(getClass().getName() + "初始化");

        for (int i = 0; i < 10; i += 2) {
            var f1t2 = Shipment.builder().id(i).fromUser(user1).toUser(user2).build();
            var f2t1 = Shipment.builder().id(i + 1).fromUser(user2).toUser(user1).build();
            shipmentRepository.save(f1t2);
            shipmentRepository.save(f2t1);
        }
    }


    @Test
    void test_findAllUsersSendPackage_and_findAllUsersSendRevPackage() {
        setup();
        var revs = shipmentRepository.findAllUsersRecPackage(user1.getId());
        var sends = shipmentRepository.findAll();
        log.info(Arrays.toString(revs.toArray()));
        log.info(Arrays.toString(sends.toArray()));
    }

    @Test
    void testSimple() {
        log.info(user1.toString());
        userRepository.save(user1);
        userRepository.save(user2);
        shipmentRepository.save(Shipment.builder().id(9999).fromUser(user1).toUser(user2).build());
        shipmentRepository.save(new Shipment());
    }


    @Autowired
    public void setShipmentRepository(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
