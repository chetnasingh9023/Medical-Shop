package com.example.demo.service;

import com.example.demo.entity.Medicine;
import com.example.demo.repo.Shop_repo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Shop_service {
    private final Shop_repo shopRepo;

    public Shop_service(Shop_repo shopRepo) {
        this.shopRepo = shopRepo;
    }

    public List<Medicine> showAll() {
        return shopRepo.findAll();
    }


    public Medicine getMedicineById(Integer id) {
        Optional<Medicine> med_op = shopRepo.findById(id);
        return med_op.orElse(null);
    }

    public void addMedicine(Medicine medicine) {
        shopRepo.save(medicine);
    }

    public Medicine updateMedicine(Medicine medicine) {
        Medicine doesExist = getMedicineById(medicine.getId());
        if (doesExist != null) {
            shopRepo.save(medicine);
            return medicine;
        } else {
            return null;
        }
    }

    public void removeMedicine(Integer id) {
        shopRepo.deleteById(id);
    }
}
