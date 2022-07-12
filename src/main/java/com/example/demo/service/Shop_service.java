package com.example.demo.service;

import com.example.demo.entity.Medicine;
import com.example.demo.repo.Shop_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Shop_service {
    @Autowired
    private Shop_repo shopRepo;

    public void addMedicine(Medicine medicine){
        shopRepo.save(medicine);
    }
    public Medicine showMedicine(Integer id){
        Optional<Medicine> med_op=shopRepo.findById(id);
        return med_op.orElse(null);
    }
    public void removeMedicine(Integer id){
        shopRepo.deleteById(id);
    }
    public List<Medicine> showAll(){
        return shopRepo.findAll();
    }
}
