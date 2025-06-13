package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.entity.EcommerceProductEntity;
import com.example.employeemanagementsystem.repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceModule {

    @Autowired
    public productRepository productRepository;

    //Post Method
    public EcommerceProductEntity createProduct(EcommerceProductEntity product)
    {
        return productRepository.save(product);
    }

    // Get Method
    public List<EcommerceProductEntity> getAllProduct()
    {
        return productRepository.findAll();
    }

    //Get by ID Method
    public EcommerceProductEntity getAllProductDetailsById(Long id)
    {
        Optional<EcommerceProductEntity> productDetailsId=productRepository.findById(id);
        return productDetailsId.orElse(null);
    }
    //Put Method
    public EcommerceProductEntity updateProduct(EcommerceProductEntity updateProduct)
    {
        return productRepository.save(updateProduct);
    }

    //Delete Method
    public void EcommerceProductEntity(Long id)
    {
        productRepository.deleteById(id);
    }

}
