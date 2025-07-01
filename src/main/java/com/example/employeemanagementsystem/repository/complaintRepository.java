package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.ComplaintEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface complaintRepository extends JpaRepository<ComplaintEntity, Long> {
    long countByStatus(ComplaintEntity.Status status);

}
