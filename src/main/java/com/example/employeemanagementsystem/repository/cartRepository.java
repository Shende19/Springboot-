package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.EcommerceCartEntity;
import com.example.employeemanagementsystem.entity.EcommerceUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface cartRepository extends JpaRepository<EcommerceCartEntity, Long> {
    List<EcommerceCartEntity> findByUser(EcommerceUserEntity user);
}
