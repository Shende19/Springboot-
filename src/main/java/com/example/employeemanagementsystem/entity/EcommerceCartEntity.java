package com.example.employeemanagementsystem.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="CartEntity")
public class EcommerceCartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @ManyToOne
    private EcommerceUserEntity user;

    @ManyToOne
    private EcommerceProductEntity product;

    private int quantity;



}
