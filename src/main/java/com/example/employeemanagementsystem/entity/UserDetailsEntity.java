package com.example.employeemanagementsystem.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="user_details")
public class UserDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    public String userName;
    public String userEmail;
    public Long userDOB;

}
