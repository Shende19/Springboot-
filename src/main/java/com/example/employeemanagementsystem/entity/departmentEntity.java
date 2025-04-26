package com.example.employeemanagementsystem.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import java.util.List;

@Data
@Entity
@Table(name="departmentinfo")
public class departmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="DeptId")
    private long dept_Id;
    @Column(name="Department_name")
    private String dept_Name;


}
