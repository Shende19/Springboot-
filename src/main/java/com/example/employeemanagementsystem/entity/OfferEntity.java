package com.example.employeemanagementsystem.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "offer")
public class OfferEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

   private Long id;

   public String getOfferName() {
      return offerName;
   }

   public void setOfferName(String offerName) {
      this.offerName = offerName;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public  String offerName;
   public String status;


}
