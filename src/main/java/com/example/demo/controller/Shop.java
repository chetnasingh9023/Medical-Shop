package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Shop {
    @GetMapping("/")
    @ResponseBody
    public String Medical() {
        return "I am owner of my shop";


    }
}
