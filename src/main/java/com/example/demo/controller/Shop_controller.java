package com.example.demo.controller;

import com.example.demo.entity.Medicine;
import com.example.demo.service.Shop_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class Shop_controller {
    @Autowired
    private Shop_service shop_service;


    @GetMapping("/")
    public String Medical(ModelMap modelMap) {
        modelMap.put("medicines", shop_service.showAll());
        modelMap.put("newMedicine", new Medicine());
        return "Home";
    }

    @PostMapping("/medicine/new")
    public String addMedicine(ModelMap modelMap, @Valid Medicine
            medicine,BindingResult result) {
        if (!result.hasErrors()) {
            shop_service.addMedicine(medicine);
        }
        modelMap.put("medicines", shop_service.showAll());
        modelMap.put("newMedicine", new Medicine());
        return "Home";
    }
}
