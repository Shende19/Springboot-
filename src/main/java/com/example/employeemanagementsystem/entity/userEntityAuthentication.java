package com.example.employeemanagementsystem.entity;


import jakarta.persistence.*;
import lombok.Data;


@Data
@Table(name="userEntity")
@Entity
public class userEntityAuthentication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String userName;
    private String passWord;
    private String role;
}
