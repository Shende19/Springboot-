package com.example.employeemanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="Inventory Management")
public class InventoryManagementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private Long availableQuantity;
    private LocalDateTime lastUpdated;
}
