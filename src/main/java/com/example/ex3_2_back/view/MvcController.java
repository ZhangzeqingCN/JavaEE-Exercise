package com.example.ex3_2_back.view;

import com.example.ex3_2_back.entity.Movie;
import com.example.ex3_2_back.entity.Shipment;
import com.example.ex3_2_back.entity.User;
import com.example.ex3_2_back.repository.MovieRepository;
import com.example.ex3_2_back.repository.UserRepository;
import com.example.ex3_2_back.repository.ShipmentRepository;
import com.example.ex3_2_back.security.MySecurity;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/test")
public class MvcController {
    MySecurity mySecurity;

    UserRepository userRepository;

    MovieRepository movieRepository;

    ShipmentRepository shipmentRepository;

    @Autowired
    public void setMovieRepository(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setMySecurity(MySecurity mySecurity) {
        this.mySecurity = mySecurity;
    }

    @Autowired
    public void setShipmentRepository(ShipmentRepository shipmentRepository) { this.shipmentRepository = shipmentRepository; }


    @GetMapping({"/index"})
    public String getIndex(Model model) {
        model.addAttribute("testMessage", "Back Server Test");
        return "index";
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

    @GetMapping("/home")
    public String getHome(Model model) { return "home"; }

    //订单追踪
    @GetMapping("/trace")
    public String getTrace(Model model) {
       // model.addAttribute("emps", employees);
        List<Shipment> shipList = shipmentRepository.findByFromUser("lisa");
        model.addAttribute("shipList", shipList);
        return "trace";
    }

    @PostMapping("/trace")
    public String trace(Model model, @RequestParam String ID, HttpServletResponse response, HttpServletRequest request){
        //获取cookie，得到token并验证
        return "trace";
    }

    @PostMapping("/login")
    public String login(Model model, @RequestParam String username, @RequestParam String password, HttpServletResponse response) {

        if (userRepository.existsByNameAndPassword(username, password)) {
            String newToken = mySecurity.genToken(new User());
            var tokenCookie = new Cookie("token", newToken);
            tokenCookie.setMaxAge(36000);//过期时间
            response.addCookie(tokenCookie);//保存cookie到客户端（会自动保存以及自动携带？）
            response.addHeader("Access-Control-Allow-Credentials", String.valueOf(true));

            model.addAttribute("loginMessage", "登录成功");

            return "redirect:/test/home";
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


}
