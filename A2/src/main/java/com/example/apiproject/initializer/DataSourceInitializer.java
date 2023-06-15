package com.example.apiproject.initializer;

import com.example.apiproject.access.Commodity;
import com.example.apiproject.access.*;
import com.example.apiproject.repository.CommodityRepository;
import com.example.apiproject.repository.*;
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

    private CourierRepository courierRepository;

    private ShipRepository shipRepository;

    private ParcelTraceRepository parcelTraceRepository;

    @Autowired
    public void setParcelTraceRepository(ParcelTraceRepository parcelTraceRepository) { this.parcelTraceRepository = parcelTraceRepository; }

    @Autowired
    public void setShipRepository(ShipRepository shipRepository) { this.shipRepository = shipRepository; }

    @Autowired
    public void setCourier(CourierRepository courierRepository) { this.courierRepository = courierRepository; }
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
        userRepository.save(User.builder().name("user").password("61259cdf-9cb1-4981-b926-35ebe0906c29").build());
        userRepository.save(User.builder().name("user1").password("123").build());
        userRepository.save(User.builder().name("zzq").password("123").build());

        final int initialUserNumber = 100;
        List<User> users = new ArrayList<>(initialUserNumber);
        for (int i = 0; i < initialUserNumber; i++) {
            users.add(User.builder().name("user" + i).password(String.valueOf(i)).build());
        }
        userRepository.saveAll(users);

        //快递员
        courierRepository.save(Courier.builder()
                .name("王力")
                .phone("13977279785")
                .build());
        //初始化订单及物流
        Commodity temp= commodityRepository.save(Commodity.builder()
                .type("食物")
                .weight(1.5F)
                .insuranceOrNot(false)
                .build());
        shipment tempShip= shipRepository.save(shipment.builder()
                .fromUser("张四")
                .fromPhone("14793898634")
                .fromAddressSelect("北京市直辖市海淀区")
                .fromAddressDetail("北京交通大学")
                .toUser("张三")
                .toPhone("15988776524")
                .toAddressDetail("柳州市第一中学")
                .toAddressSelect("广西壮族自治区柳州市鱼峰区")
                .commodity(temp)
                .chooseCourier("王力")
                .estimatedCost("10")
                .parcelTrace("已发货")
                .placeAnOrderTime("2023-06-10 12:09:12")
                .paymentMethod("微信")
                .shippingCode("9870")
                .build());
        parcelTraceRepository.save(ParcelTrace.builder()
                .shipment(tempShip)
                .siteName("北京市中关村二部")
                .siteAttribute("起点")
                .arriveTime("2023-06-10 16:39:12")
                .leaveTime("2023-06-10 17:09:19")
                .build());
        parcelTraceRepository.save(ParcelTrace.builder()
                .shipment(tempShip)
                .siteName("武汉中转站")
                .siteAttribute("中转站")
                .arriveTime("2023-06-11 17:39:12")
                .leaveTime("2023-06-11 19:09:34")
                .build());
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

