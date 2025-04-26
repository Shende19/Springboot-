package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.employeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepo extends JpaRepository<employeeEntity,Long> {


}
