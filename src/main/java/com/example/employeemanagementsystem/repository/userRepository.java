package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.EcommerceUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<EcommerceUserEntity, Long> {
}
