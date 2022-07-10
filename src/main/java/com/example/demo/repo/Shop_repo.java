package com.example.demo.repo;

import com.example.demo.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Shop_repo extends JpaRepository<Medicine,Integer>{
}
