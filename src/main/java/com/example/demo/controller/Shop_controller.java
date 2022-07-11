package com.example.demo.controller;

import com.example.demo.entity.Medicine;
import com.example.demo.service.Shop_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Shop_controller {
    @Autowired
    private Shop_service shop_service;


    @GetMapping("/")
    public String Medical(ModelMap modelMap) {
     modelMap.put("medicines",shop_service.showAll());
        modelMap.put("newMedicine",new Medicine());

        return "Home";


    }
}
