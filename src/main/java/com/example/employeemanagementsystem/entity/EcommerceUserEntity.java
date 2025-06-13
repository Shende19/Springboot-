package com.example.employeemanagementsystem.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name="User")
@Entity
public class EcommerceUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String role;

}
