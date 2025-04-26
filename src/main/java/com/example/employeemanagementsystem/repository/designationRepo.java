package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.designationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface designationRepo extends JpaRepository<designationEntity, Long>{
}
