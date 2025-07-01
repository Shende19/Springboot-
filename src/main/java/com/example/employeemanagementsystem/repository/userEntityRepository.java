package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.userEntityAuthentication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository


public interface userEntityRepository extends JpaRepository<userEntityAuthentication,Long> {

    Optional<userEntityAuthentication> findByUserName(String userName);

}

