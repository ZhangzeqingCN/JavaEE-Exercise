package com.example.a2.view;

import com.example.a2.entity.Shipment;
import com.example.a2.entity.User;
import com.example.a2.repository.UserRepository;
import com.example.a2.repository.ShipmentRepository;
import com.example.a2.security.MySecurity;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

import java.util.*;

@Controller
@RequestMapping("/test")
@Slf4j
public class MvcController {
    MySecurity mySecurity;

    UserRepository userRepository;


    ShipmentRepository shipmentRepository;


    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setMySecurity(MySecurity mySecurity) {
        this.mySecurity = mySecurity;
    }

    @Autowired
    public void setShipmentRepository(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }


    @GetMapping({"/index"})
    public String getIndex(Model model) {
        model.addAttribute("testMessage", "Back Server Test");
        return "index";
    }

    @GetMapping("/nothing")
    public String getNothing(Model model, HttpServletResponse response, HttpServletRequest request) {
        var headerNames = request.getHeaderNames().asIterator();
        while (headerNames.hasNext()) {
            var headerName = headerNames.next();
            log.info(String.format("%s %s", headerName, request.getHeader(headerName)));
        }
        return "nothing";
    }

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        return "login";
    }

    @GetMapping("/shipment")
    public String getShipmentPage(Model model) {
        return "shipment";
    }

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        return "register";
    }

    //寄件页面
    @GetMapping("/home")
    public String getHome(Model model) {
        return "home";
    }

    //订单追踪
    @GetMapping("/trace")
    public String getTrace(Model model, HttpServletRequest request) {
        String token = null;
        var cookies = request.getCookies();
        if (cookies != null) {
            for (var cookie : cookies) {
                if (Objects.equals(cookie.getName(), "token")) {
                    token = cookie.getValue();
                    Optional<User> optionalUser = mySecurity.decToken(token);
                    if (optionalUser.isPresent()){
                        System.err.println("id==="+optionalUser.get().getId());
                        Optional<User> temp = userRepository.findById(optionalUser.get().getId());
                        List<Shipment> shipList = shipmentRepository.findByFromUser(temp.get());
                        if (!shipList.isEmpty()){
                            model.addAttribute("shipList", shipList);
                        }
                    }

                    break;
                }
            }
        }
//        Optional<User> temp = userRepository.findByNameAndPassword("hyt", "123");
////        List<Shipment> shipList = shipmentRepository.findAllUsersSendPackage(temp.get().getId());
//        var shipList = shipmentRepository.findAll();
//        if (!shipList.isEmpty()) {
//            model.addAttribute("shipList", shipList);
//        }

        return "trace";
    }

    @PostMapping("/trace")
    public String trace(Model model, @RequestParam String ID, HttpServletResponse response, HttpServletRequest request) {
        //若订单号存在
        if (shipmentRepository.existsById(Integer.valueOf(ID))) {
            System.out.print(ID);
            Optional<Shipment> shipList = shipmentRepository.findById(Integer.valueOf(ID));
            List<Shipment> result = new ArrayList<>();
            result.add(shipList.get());
            model.addAttribute("shipList", result);
            model.addAttribute("checkResult", "查询成功");
        } else { //订单号不存在
            model.addAttribute("checkResult", "查询失败");
        }
        return "trace";
    }

    @PostMapping("/login")
    public String login(Model model, @RequestParam String username, @RequestParam String password, HttpServletResponse response) {

        if (userRepository.existsByNameAndPassword(username, password)) {
            Optional<User> user = userRepository.findByNameAndPassword(username, password);
            if(user.isPresent()){
                String newToken = mySecurity.genToken(user.get());
                var tokenCookie = new Cookie("token", newToken);
                tokenCookie.setMaxAge(36000);//过期时间
                response.addCookie(tokenCookie);//保存cookie到客户端（会自动保存以及自动携带？）
                response.addHeader("Access-Control-Allow-Credentials", String.valueOf(true));

                model.addAttribute("loginMessage", "登录成功");

                return "redirect:/test/home";
            }
            model.addAttribute("loginMessage", "登录失败");
            return "login";
        } else {
            model.addAttribute("loginMessage", "登录失败");
            return "login";
        }
    }

    @PostMapping("/register")
    public String register(Model model, @RequestParam String username, @RequestParam String password, HttpServletResponse response) {

        System.err.println(username + " " + password);
        if (userRepository.existsByNameAndPassword(username, password)) {
            model.addAttribute("registerMessage", "该账户已注册");
            return "register";
        }

        userRepository.save(User.builder().name(username).password(password).build());

        return "login";
    }

    // 接收寄件信息
    @PostMapping("/home")
    public String home(Model model, @RequestParam String fromUser, @RequestParam String formPhone, @RequestParam String formAddress,
                       @RequestParam String toUser, @RequestParam String toPhone, @RequestParam String toAddress) {
        System.err.println("fromUser: " + fromUser + " " + formPhone + " " + formAddress);
        System.err.println("Receiver: " + toUser + " " + toPhone + " " + toAddress);
        // 随机生成shipmentId(0-10000,唯一）
//        Random random = new Random();
//        int id = random.nextInt(10000);
//        Optional<Shipment> shipment = shipmentRepository.findById(id);
//        while(shipment.isEmpty()){
//            id = random.nextInt(10000);
//            shipment = shipmentRepository.findById(id);
//        }
//        System.err.println("shipmentId: "+id);
        // 找到对应User对象
        Optional<User> tempFromUser = userRepository.findByName(fromUser);
        Optional<User> tempToUser = userRepository.findByName(toUser); // 有可能不存在toUser的对象
        if (tempFromUser.isEmpty() || tempToUser.isEmpty()) {
            System.err.println("Empty");
            return "home";
        }
        // 将信息存入表Shipment中
        shipmentRepository.save(Shipment.builder().fromUser(tempFromUser.get()).fromPhone(formPhone).fromAddress(formAddress)
                .toUser(tempToUser.get()).toPhone(toPhone).toAddress(toAddress)
                .build());
        // 返回包裹信息给用户(Userid->对应shipment对象->shipmentId）
        int userId = tempFromUser.get().getId();
        System.err.println("FromUserId: " + userId);
        List<Shipment> temp = shipmentRepository.findAllUsersSendPackage(userId);
        System.out.print(temp.toString());
//        model.addAttribute("shipList", temp);

//        Optional<Shipment> tempShipment = shipmentRepository.findByFromUser_1(tempFromUser.get());
//        int shipmentId = tempShipment.get().getId();
//        System.err.println("shipmentId: " +shipmentId);

//         List<Shipment> tempShipment = shipmentRepository.findAllUsersSendPackage(tempFromUser.get().getId());// 报错
//        System.err.println("Shipment: " + tempShipment.toString());
        return "home";
    }

//    private int random(){
//
////        String str = "0123456789"; //添加10个字符
////        Random random = new Random();
////        StringBuffer sb = new StringBuffer();
////        for(int i = 0; i < 10; i++){
////            int ID = random.nextInt(10);
////            sb.append(str.charAt(ID));
////        }
////        System.out.println("ID" + " " + sb);
////
//    }
}
