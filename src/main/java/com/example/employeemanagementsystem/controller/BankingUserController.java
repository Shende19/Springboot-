package com.example.employeemanagementsystem.controller;


import com.example.employeemanagementsystem.entity.BankingUserEntity;
import com.example.employeemanagementsystem.service.BankingUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/BankingUser")
public class BankingUserController {

    @Autowired
    public BankingUserService bankingUserService;

    // creating User Account for sign-up
    @PostMapping("/sign-up")
    public ResponseEntity<BankingUserEntity> createSignUp(@RequestBody BankingUserEntity bankingUserEntity) {
        BankingUserEntity userSignUpDetails = bankingUserService.bankingUserDetails(bankingUserEntity);
        return ResponseEntity.ok(userSignUpDetails);
    }

    //log in User Account using email and password
    @PostMapping("/Log-In")
    public ResponseEntity<BankingUserEntity> createLogInForUser(@RequestParam String email, @RequestParam String password) {
        BankingUserEntity userLogInDetails = bankingUserService.loginUser(email, password);
        return ResponseEntity.ok(userLogInDetails);
    }

}

