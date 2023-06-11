package com.example.apiproject.service;

import com.example.apiproject.access.*;
import com.example.apiproject.access.FromPeople;
import com.example.apiproject.access.User;
import com.example.apiproject.domain.Result;
import com.example.apiproject.domain.order.*;
import com.example.apiproject.repository.ShipRepository;
import com.example.apiproject.repository.*;
import com.example.apiproject.utils.MyJwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.apiproject.domain.ResultDataForm.*;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;

/**
 * @Auther HYT
 * @Date 2023/6/5
 * @Desc
 */
@Service
@Slf4j
public class OrderService {
    private ShipRepository shipRepository;

    private CommodityRepository commodityRepository;

    private UserRepository userRepository;

    private MyJwtUtil jwtUtil;

    @Autowired
    public void setUserRepository(ShipRepository shipRepository) {
        this.shipRepository = shipRepository;
    }

    @Autowired
    public void setJwtUtil(MyJwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @Autowired
    public void setCommodityRepository(CommodityRepository commodityRepository) { this.commodityRepository = commodityRepository; }

    @Autowired
    public void setUserRepository(UserRepository userRepository) { this.userRepository = userRepository; }

    public String getshippingCode(){
        Random random = new Random();
        String shippingCode = "";
        for (int i = 0; i < 4; i++) {
            int number = random.nextInt(10);
            shippingCode = shippingCode.concat(String.valueOf(number));
        }
        return shippingCode;
    }
    public Result addNewOrder(@NotNull addNewOrderDomain addNewOrderDomain,HttpServletRequest request){
        try{
            Commodity temp= commodityRepository.save(Commodity.builder()
                    .notes(addNewOrderDomain.getItem().getNotes())
                    .type(addNewOrderDomain.getItem().getType())
                    .weight(Float.valueOf(addNewOrderDomain.getItem().getWeight()))
                    .insuranceOrNot(addNewOrderDomain.getItem().getInsuranceOrNot())
                    .build());
            String shippingCode = getshippingCode();
           shipment tempShip= shipRepository.save(shipment.builder()
                    .fromUser(addNewOrderDomain.getFromPeople().getFromPeople())
                    .fromPhone(addNewOrderDomain.getFromPeople().getFromPhone())
                    .fromAddressSelect(addNewOrderDomain.getFromPeople().getFromAddrSelect())
                    .fromAddressDetail(addNewOrderDomain.getFromPeople().getFromAddrDetail())
                    .toUser(addNewOrderDomain.getToPeople().getToPeople())
                    .toPhone(addNewOrderDomain.getToPeople().getToPhone())
                    .toAddressDetail(addNewOrderDomain.getToPeople().getToAddrDetail())
                    .toAddressSelect(addNewOrderDomain.getToPeople().getToAddrSelect())
                    .commodity(temp)
                    .chooseCourier(addNewOrderDomain.getChooseCourier())
                    .estimatedCost(addNewOrderDomain.getEstimatedCost())
                    .parcelTrace("待寄件")
                    .placeAnOrderTime(addNewOrderDomain.getPlaceAnOrderTime())
                    .paymentMethod(addNewOrderDomain.getPaymentMethod())
                    .shippingCode(shippingCode)
                    .build());
            addNewOrderData data = new addNewOrderData(shippingCode,String.valueOf(tempShip.getId()));
            return Result.success(data);
        }catch (Exception e){
            return Result.error("插入异常，信息为"+e);
        }
    }

    public Result checkOrderByShipmentCode(@NotNull String ShipmentCode){
        return Result.success();
    }

    public Result getAllOrders(HttpServletRequest request){
        String token = null;
        var cookies = request.getCookies();
        if (cookies != null) {
            for (var cookie : cookies) {
                if (Objects.equals(cookie.getName(), "token")) {
                    token = cookie.getValue();
                    Optional<String> name=jwtUtil.decodeToken(token);
                    if(name.isPresent()){
                        Optional<User> userOptional=userRepository.findByName(name.get());
                        if(userOptional.isPresent()){

                            return Result.success();
                        } else {
                            return Result.error("本用户不存在");
                        }
                    }else{
                        return Result.error("用户鉴权失败");
                    }
                }
            }
        }
        return Result.error("用户鉴权失败");
    }

    public Result showOrderDetail(String shipmentCode){
        return Result.success();
    }
}
