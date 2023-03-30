package com.example.ex3_2_back.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController {
    @GetMapping({"/index", "/", ""})
    public String getIndex(Model model) {
        model.addAttribute("testMessage", "Back Server Test");
        return "index";
    }
}
