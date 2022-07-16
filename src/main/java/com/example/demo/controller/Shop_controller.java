package com.example.demo.controller;

import com.example.demo.entity.Medicine;
import com.example.demo.service.Shop_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class Shop_controller {
    private final Shop_service shop_service;

    public Shop_controller(Shop_service shop_service) {
        this.shop_service = shop_service;
    }


    @GetMapping("/")
    public String Medical(ModelMap modelMap) {
        modelMap.put("medicines", shop_service.showAll());
        modelMap.put("newMedicine", new Medicine());
        return "Home";
    }

    @PostMapping("/medicine/new")
    public String addMedicine(ModelMap modelMap, @Valid Medicine medicine, BindingResult result) {
        if (!result.hasErrors()) {
            shop_service.addMedicine(medicine);
            return "redirect:/";
        } else {
            return "redirect:/error";
        }
    }

    @GetMapping("/Edit/{id}")
    public String editMedicine(@PathVariable Integer id, ModelMap modelMap) {
        Medicine medicine = shop_service.getMedicineById(id);
        if (medicine != null) {
            modelMap.put("medicine_edited", medicine);
            return "Edit_medicine";
        } else {
            return "redirect:/error";
        }
    }


    @PostMapping("/medicine/update")
    public String submitEdit(@Valid Medicine medicine, BindingResult result) {
        if (!result.hasErrors()) {
            shop_service.updateMedicine(medicine);
            return "redirect:/";
        } else {
            return "redirect:/error";
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteMedicine(@PathVariable Integer id) {
        shop_service.removeMedicine(id);
        return "redirect:/";
    }
}