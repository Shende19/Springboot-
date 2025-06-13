package com.example.employeemanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="AddressEntity")
public class EcommerceAddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String street;
    private String city;
    private String zip;
    private String state;

    @ManyToOne
    private EcommerceUserEntity  user;


}
