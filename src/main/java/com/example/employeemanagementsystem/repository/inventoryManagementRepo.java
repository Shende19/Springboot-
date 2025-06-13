package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.InventoryManagementEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface inventoryManagementRepo extends JpaRepository<InventoryManagementEntity , Long> {
}
