package com.example.employeemanagementsystem.service;
import com.example.employeemanagementsystem.entity.InventoryManagementEntity;
import com.example.employeemanagementsystem.repository.inventoryManagementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class inventoryManagementService {
    @Autowired
  public inventoryManagementRepo  inventoryManagementRepo;

    //Post Method
    public InventoryManagementEntity createInventory(InventoryManagementEntity inventory)
    {
        return inventoryManagementRepo.save(inventory) ;
    }

    // Get Method
    public List<InventoryManagementEntity> getAllInventoryDetails()
    {
        return inventoryManagementRepo.findAll();
    }

    //Get by ID Method
    public InventoryManagementEntity getAllManagementDetailsById(Long productId)
    {
        Optional<InventoryManagementEntity> productDetailsId=inventoryManagementRepo.findById(productId);
        return productDetailsId.orElse(null);
    }
    //Put Method
    public InventoryManagementEntity updateLastInventory(Long productId , InventoryManagementEntity updateInventory)
    {
        Optional<InventoryManagementEntity> productDetailsId=inventoryManagementRepo.findById(productId);
        return productDetailsId.orElse(null);
    }

    //Delete Method
    public void InventoryManagementEntity(Long productId)
    {
        inventoryManagementRepo.deleteById(productId);
    }

}
