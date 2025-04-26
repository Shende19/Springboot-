package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.entity.UserDetailsEntity;
import com.example.employeemanagementsystem.entity.employeeEntity;
import com.example.employeemanagementsystem.repository.userDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userDetailsService {
    @Autowired
    userDetailsRepo userDetailsRepo;

    // get mapping
    public List<UserDetailsEntity> getUserAllData()
    {
        return userDetailsRepo.findAll();
    }

    //post mapping
    public UserDetailsEntity userDetailsMapping(UserDetailsEntity userEntityDetails)
    {
        return userDetailsRepo.save(userEntityDetails);
    }


}
