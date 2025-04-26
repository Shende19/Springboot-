package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.UserDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userDetailsRepo extends JpaRepository<UserDetailsEntity,Long> {
}
