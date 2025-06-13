package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.EcommerceProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface productRepository extends JpaRepository<EcommerceProductEntity, Long > {



}
