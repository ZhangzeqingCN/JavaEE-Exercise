package com.example.apiproject.controller;


import com.example.apiproject.domain.Result;
import com.example.apiproject.domain.auth.*;
import com.example.apiproject.domain.auth.LoginDomain;
import com.example.apiproject.domain.auth.RegisterDomain;
import com.example.apiproject.service.AuthService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@Slf4j
public class AuthController {

    private AuthService authService;

    @Autowired
    public void setAuthService(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    @NotNull
    public Result login(@RequestBody @NotNull LoginDomain loginDomain, HttpServletResponse response) {
        return authService.login(loginDomain, response);
    }

    @RequestMapping("/logout")
    @NotNull
    public Result logout(HttpServletResponse response) {
        authService.removeTokenCookie(response);
        return Result.success();
    }

    @PostMapping("/register")
    public Result register(@RequestBody @NotNull RegisterDomain registerDomain) {
        return authService.register(registerDomain);
    }

    @PostMapping("/saveFrom")
    public Result saveFrom(@RequestBody @NotNull saveFromPeople saveFromPeople, HttpServletRequest request) {
        return authService.saveFrom(saveFromPeople,request);
    }

    @PostMapping("/saveTo")
    public Result saveTo(@RequestBody @NotNull saveToPeople saveToPeople, HttpServletRequest request) {
        return authService.saveTo(saveToPeople,request);
    }

    @DeleteMapping("/deleteFrom")
    public Result deleFrom(@RequestParam(value = "id") String id){
        return authService.deleteFrom(id);
    }

    @DeleteMapping("/deleteTo")
    public Result deleTo(@RequestParam(value = "id") String id){
        return authService.deleteTo(id);
    }

    @GetMapping("/showFromPeople")
    public Result showFromPeople(HttpServletRequest request){
        return authService.showFromPeople(request);
    }

    @GetMapping("/showToPeople")
    public Result showToPeople(HttpServletRequest request){
        return authService.showToPeople(request);
    }


}
