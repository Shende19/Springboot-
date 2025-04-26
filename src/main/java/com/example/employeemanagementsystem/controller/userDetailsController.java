package com.example.employeemanagementsystem.controller;


import com.example.employeemanagementsystem.entity.UserDetailsEntity;
import com.example.employeemanagementsystem.service.userDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class userDetailsController {
    @Autowired
    userDetailsService userDetailsService;

    @GetMapping("/client-user-details")
    public List<UserDetailsEntity> getUserServiceDetail()
    {
        return userDetailsService.getUserAllData();

    }

    @PostMapping("/client-user-data")
    public ResponseEntity<String> insertUserData(@RequestBody UserDetailsEntity UserDetailsEntity )
    {
        userDetailsService.userDetailsMapping(UserDetailsEntity);
        return ResponseEntity.ok("Data Inserted Successfully");
    }
}
