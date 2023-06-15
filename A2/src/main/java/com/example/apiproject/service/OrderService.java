package com.example.apiproject.service;

import com.example.apiproject.access.*;
import com.example.apiproject.access.FromPeople;
import com.example.apiproject.access.User;
import com.example.apiproject.domain.Result;
import com.example.apiproject.domain.order.*;
import com.example.apiproject.domain.auth.*;
import com.example.apiproject.repository.ShipRepository;
import com.example.apiproject.repository.*;
import com.example.apiproject.utils.MyJwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.apiproject.domain.ResultDataForm.*;

import java.util.*;

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

    private CourierRepository courierRepository;

    private ParcelTraceRepository parcelTraceRepository;

    private MyJwtUtil jwtUtil;

    @Autowired
    public void setParcelTrace(ParcelTraceRepository parcelTraceRepository) { this.parcelTraceRepository = parcelTraceRepository; }

    @Autowired
    public void setCourierRepository(CourierRepository courierRepository) { this.courierRepository = courierRepository; }
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
    /**
     * apiFox返回的时列表，应该时对象
     */
    public Result checkOrderByShipmentCode(@NotNull String shipmentCode){
        if (shipRepository.existsById(Integer.valueOf(shipmentCode))){
           Optional<shipment> ship= shipRepository.findById(Integer.valueOf(shipmentCode));
           if (ship.isPresent()){
               shipCodeData result = new shipCodeData();
               result.setShipmentCode(shipmentCode);
               result.setPlaceAnOrderTime(ship.get().getPlaceAnOrderTime());
               saveFromPeople fromPeople = new saveFromPeople();
               fromPeople.setFromPeople(ship.get().getFromUser());
               fromPeople.setFromPhone(ship.get().getFromPhone());
               fromPeople.setFromAddrDetail(ship.get().getFromAddressDetail());
               fromPeople.setFromAddrSelect(ship.get().getFromAddressSelect());
               result.setFromPeople(fromPeople);
               saveToPeople toPeople = new saveToPeople();
               toPeople.setToPeople(ship.get().getToUser());
               toPeople.setToPhone(ship.get().getToPhone());
               toPeople.setToAddrDetail(ship.get().getToAddressDetail());
               toPeople.setToAddrSelect(ship.get().getToAddressSelect());
               result.setToPeople(toPeople);
               Commodity commodity= ship.get().getCommodity();
               item item =  new item();
               item.setType(commodity.getType());
               item.setWeight((commodity.getWeight()).toString());
               result.setItem(item);
               //快递员数据，造假还是？
               String courierName = ship.get().getChooseCourier();
               Optional<Courier> temp = courierRepository.findByName(courierName);
               courier courier = new courier();
               courier.setCourierName(courierName);
               if (temp.isPresent()){
                   courier.setCourierPhone(temp.get().getPhone());
               } else {
                   courier.setCourierPhone("1473859845");
               }
               result.setCourier(courier);
               return Result.success(result);
           } else {
               return Result.error("包裹不存在");
           }
        }else {
            return Result.error("包裹不存在");
        }
    }

    /**
     * 自己是收/发货是否要分开
     * 根据电话号码匹配
     * @param request
     * @return
     */
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
                            List<shipment> fromShip= shipRepository.findByFromPhone(userOptional.get().getPhone());
                            List<shipment> toShip= shipRepository.findByToPhone(userOptional.get().getPhone());
                            List<shipCodeData> resultList = new ArrayList<>();
                            if (fromShip.size()>0){
                                for (int i=0;i<fromShip.size();i++ ) {
                                    shipCodeData result = new shipCodeData();
                                    result.setShipmentCode((fromShip.get(i).getId()).toString());
                                    result.setPlaceAnOrderTime(fromShip.get(i).getPlaceAnOrderTime());
                                    saveFromPeople fromPeople = new saveFromPeople();
                                    fromPeople.setFromPeople(fromShip.get(i).getFromUser());
                                    fromPeople.setFromPhone(fromShip.get(i).getFromPhone());
                                    fromPeople.setFromAddrDetail(fromShip.get(i).getFromAddressDetail());
                                    fromPeople.setFromAddrSelect(fromShip.get(i).getFromAddressSelect());
                                    result.setFromPeople(fromPeople);
                                    saveToPeople toPeople = new saveToPeople();
                                    toPeople.setToPeople(fromShip.get(i).getToUser());
                                    toPeople.setToPhone(fromShip.get(i).getToPhone());
                                    toPeople.setToAddrDetail(fromShip.get(i).getToAddressDetail());
                                    toPeople.setToAddrSelect(fromShip.get(i).getToAddressSelect());
                                    result.setToPeople(toPeople);
                                    Commodity commodity= fromShip.get(i).getCommodity();
                                    item item =  new item();
                                    item.setType(commodity.getType());
                                    item.setWeight((commodity.getWeight()).toString());
                                    result.setItem(item);
                                    //快递员数据，造假还是？
                                    String courierName = fromShip.get(i).getChooseCourier();
                                    Optional<Courier> temp = courierRepository.findByName(courierName);
                                    courier courier = new courier();
                                    courier.setCourierName(courierName);
                                    if (temp.isPresent()){
                                        courier.setCourierPhone(temp.get().getPhone());
                                    } else {
                                        courier.setCourierPhone("1473859845");
                                    }
                                    result.setCourier(courier);
                                    resultList.add(result);
                                }
                            }
                            if (toShip.size()>0){
                                for (int i=0;i<toShip.size();i++ ) {
                                    shipCodeData result = new shipCodeData();
                                    result.setShipmentCode(toShip.get(i).getShippingCode());
                                    result.setPlaceAnOrderTime(toShip.get(i).getPlaceAnOrderTime());
                                    saveFromPeople fromPeople = new saveFromPeople();
                                    fromPeople.setFromPeople(toShip.get(i).getFromUser());
                                    fromPeople.setFromPhone(toShip.get(i).getFromPhone());
                                    fromPeople.setFromAddrDetail(toShip.get(i).getFromAddressDetail());
                                    fromPeople.setFromAddrSelect(toShip.get(i).getFromAddressSelect());
                                    result.setFromPeople(fromPeople);
                                    saveToPeople toPeople = new saveToPeople();
                                    toPeople.setToPeople(toShip.get(i).getToUser());
                                    toPeople.setToPhone(toShip.get(i).getToPhone());
                                    toPeople.setToAddrDetail(toShip.get(i).getToAddressDetail());
                                    toPeople.setToAddrSelect(toShip.get(i).getToAddressSelect());
                                    result.setToPeople(toPeople);
                                    Commodity commodity= toShip.get(i).getCommodity();
                                    item item =  new item();
                                    item.setType(commodity.getType());
                                    item.setWeight((commodity.getWeight()).toString());
                                    result.setItem(item);
                                    //快递员数据，造假还是？
                                    String courierName = toShip.get(i).getChooseCourier();
                                    Optional<Courier> temp = courierRepository.findByName(courierName);
                                    courier courier = new courier();
                                    courier.setCourierName(courierName);
                                    if (temp.isPresent()){
                                        courier.setCourierPhone(temp.get().getPhone());
                                    } else {
                                        courier.setCourierPhone("1473859845");
                                    }
                                    result.setCourier(courier);
                                    resultList.add(result);
                                }
                            }
                            return Result.success(resultList);
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

    /**
     * 查包裹物流记录
     * 是不是应该初始化一些订单，填充物流信息
     * @param shipmentCode
     * @return
     */
    public Result showOrderDetail(String shipmentCode){
        Optional<shipment> shipment = shipRepository.findById(Integer.valueOf(shipmentCode));
        if (shipment.isPresent()){
            List<ParcelTrace> parcel = parcelTraceRepository.findByShipment(shipment.get());
            if (parcel.size()>0){
                return Result.success(parcel);
            } else {
                return Result.error("包裹未发货，物流信息为空");
            }
        } else {
            return Result.error("包裹不存在");
        }
    }
}
