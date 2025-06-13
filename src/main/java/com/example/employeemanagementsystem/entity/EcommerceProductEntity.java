package com.example.employeemanagementsystem.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Product Entity")
public class EcommerceProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private int unit;
    private String description;
    private String category;

}
