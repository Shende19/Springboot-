package com.example.employeemanagementsystem.controller;

import com.example.employeemanagementsystem.entity.InventoryManagementEntity;
import com.example.employeemanagementsystem.service.inventoryManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventoryManagement")
public class inventoryManagementController {
    @Autowired
    public inventoryManagementService inventoryManagementService;

    @PostMapping("/inventory")
    public ResponseEntity<InventoryManagementEntity> createInventory(@RequestBody InventoryManagementEntity InventoryManagementEntity)
    {
        InventoryManagementEntity inventoryEntity=inventoryManagementService.createInventory(InventoryManagementEntity);
        return ResponseEntity.ok(inventoryEntity);
    }

    @GetMapping("/inventory")
    public ResponseEntity<List<InventoryManagementEntity>> getAllInventory()
    {
        List<InventoryManagementEntity> list=inventoryManagementService.getAllInventoryDetails();
        return ResponseEntity.ok(list);
    }

    @PutMapping("/inventory/{productId}")
    public ResponseEntity<InventoryManagementEntity> updateInventoryDetails(@PathVariable Long productId , @RequestBody InventoryManagementEntity inventoryManagementEntity )
    {
        InventoryManagementEntity updateInventory=inventoryManagementService.updateLastInventory(productId,inventoryManagementEntity);
        return ResponseEntity.ok(updateInventory);
    }

    @DeleteMapping("/inventory")
    public ResponseEntity<String> deleteInventoryData(@RequestParam long productId)
    {
        inventoryManagementService.InventoryManagementEntity(productId);
        return ResponseEntity.ok("data deleted successfully");
    }


}
