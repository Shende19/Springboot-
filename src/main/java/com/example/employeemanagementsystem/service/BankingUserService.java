package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.entity.BankingUserEntity;
import com.example.employeemanagementsystem.repository.BankingUserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class BankingUserService {
    @Autowired
    public BankingUserInterface BankingUserInterface;

    // for sign up
    public BankingUserEntity bankingUserDetails(BankingUserEntity BankingUserEntity) {
        Optional<BankingUserEntity> existingUser = BankingUserInterface.findByEmail(BankingUserEntity.getEmail());
        if (existingUser.isPresent()) {
            throw new RuntimeException("Email already registered!");

        }
        return BankingUserInterface.save(BankingUserEntity);

    }

    // log in page
        public BankingUserEntity loginUser(String email, String password) {
            BankingUserEntity userLogInDetails = BankingUserInterface.findByEmail(email)
                    .orElseThrow(() -> new RuntimeException("Invalid email!"));

            if (!userLogInDetails.getPassword().equals(password)) {
                throw new RuntimeException("Invalid password!");
            }

            return BankingUserInterface.save(userLogInDetails);





    }

}
