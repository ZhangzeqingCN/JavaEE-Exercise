package com.example.ex3_2_back.view;

import com.example.ex3_2_back.entity.User;
import com.example.ex3_2_back.repository.UserRepository;
import com.example.ex3_2_back.security.MySecurity;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class MvcController {
    MySecurity mySecurity;

    UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setMySecurity(MySecurity mySecurity) {
        this.mySecurity = mySecurity;
    }

    @GetMapping({"/index", "/", ""})
    public String getIndex(Model model) {
        model.addAttribute("testMessage", "Back Server Test");
        return "index";
    }

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        return "login";
    }

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        return "register";
    }

    @PostMapping("/login")
    public String login(Model model, @RequestParam String username, @RequestParam String password, HttpServletResponse response) {

        if (userRepository.existsByNameAndPassword(username, password)) {
            String newToken = mySecurity.genToken(new User());
            var tokenCookie = new Cookie("token", newToken);
            tokenCookie.setMaxAge(36000);
            response.addCookie(tokenCookie);
            response.addHeader("Access-Control-Allow-Credentials", String.valueOf(true));

            model.addAttribute("loginMessage", "登录成功");

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

}
