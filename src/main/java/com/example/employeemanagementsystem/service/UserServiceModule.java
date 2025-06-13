package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.entity.EcommerceUserEntity;
import com.example.employeemanagementsystem.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceModule {
    @Autowired

    private userRepository userRepository;

    public EcommerceUserEntity createUser (EcommerceUserEntity user)
    {
        return userRepository.save(user);
    }
}
