package com.example.employeemanagementsystem.controller;

import com.example.employeemanagementsystem.entity.EcommerceProductEntity;
import com.example.employeemanagementsystem.service.ProductServiceModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class EcommerceProductController {
    @Autowired
    public ProductServiceModule ProductServiceModule;

    @PostMapping("/products")
    public ResponseEntity<EcommerceProductEntity> createProduct(@RequestBody EcommerceProductEntity EcommerceProductEntity)
    {
        EcommerceProductEntity entity=ProductServiceModule.createProduct(EcommerceProductEntity);
        return ResponseEntity.ok(entity);
    }

    @GetMapping("/products")
    public ResponseEntity<List<EcommerceProductEntity>> getAllProducts()
    {
        List<EcommerceProductEntity> list=ProductServiceModule.getAllProduct();
        return ResponseEntity.ok(list);
    }

    @PutMapping("/products")
    public ResponseEntity<EcommerceProductEntity> updateProductDetails(@RequestBody EcommerceProductEntity ecommerceProductEntity )
    {
        EcommerceProductEntity updateEntity=ProductServiceModule.updateProduct(ecommerceProductEntity);
        return ResponseEntity.ok(updateEntity);
    }

    @DeleteMapping("/products")
    public ResponseEntity<String> deleteProductData(@RequestParam long id)
    {
          ProductServiceModule.EcommerceProductEntity(id);
        return ResponseEntity.ok("data deleted successfully");
    }

    @GetMapping("/products/{id}")
    public EcommerceProductEntity  getProductByID(@PathVariable("id") Long id)
    {
        return ProductServiceModule.getAllProductDetailsById(id);
    }
}
