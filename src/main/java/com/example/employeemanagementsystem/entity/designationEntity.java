package com.example.employeemanagementsystem.entity;


import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name= "designationinfo")
public class designationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="emp_id")
    private long employeeID;
    @Column(name="emp_name")
    private String employeename;
    @Column(name="designation")
    private String designation;


}
