package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.entity.BankingUserEntity;
import com.example.employeemanagementsystem.repository.BankingUserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class BankingUserDetailsService implements UserDetailsService {
        @Autowired
        private BankingUserInterface bankinguserinterface;

        @Override
        public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
            // 1️⃣ Fetch user from DB
            BankingUserEntity userEntity = bankinguserinterface.findByEmail(email)
                    .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));

            // 2️⃣ Return UserDetails object (Spring Security's User class)
            return new org.springframework.security.core.userdetails.User(
                    userEntity.getEmail(),              // username
                    userEntity.getPassword(),           // password
                    new ArrayList<>()                   // authorities (roles — empty for now)
            );
        }
    }

