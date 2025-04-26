package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.OfferEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface offerRepo extends JpaRepository<OfferEntity, Long> {

    @Query(value = "select offer_name,status from offer",nativeQuery = true)
    public List<Object[]> getOfferStatus();

    @Query(value = "select * from offer where id=:id",nativeQuery = true)
    public OfferEntity getOfferEntityById(@Param("id") Long id);

    @Query(value = "select offer_name from offer",nativeQuery = true)
    public List<Object[]> getAllOfferName();
}
