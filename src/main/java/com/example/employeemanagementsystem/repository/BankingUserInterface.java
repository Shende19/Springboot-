package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.BankingUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface BankingUserInterface extends JpaRepository<BankingUserEntity,Long> {

    Optional<BankingUserEntity> findByEmail(String email);
}
