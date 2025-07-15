package com.example.employeemanagementsystem.controller;

import com.example.employeemanagementsystem.Security.JwtUtility;
import com.example.employeemanagementsystem.dto.jwtRequest;
import com.example.employeemanagementsystem.dto.jwtResponse;
import com.example.employeemanagementsystem.service.BankingUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthControllerClass {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtility jwtUtility;

    @Autowired
    private BankingUserDetailsService bankingUserDetails;

    @PostMapping("/login")
    public jwtResponse login(@RequestBody jwtRequest jwtRequest) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            jwtRequest.getEmail(),
                            jwtRequest.getPassword()
                    )
            );

            final var userDetails = bankingUserDetails.loadUserByUsername(jwtRequest.getEmail());
            final String token = jwtUtility.generateToken(userDetails.getUsername());

            return new jwtResponse(token);

        } catch (AuthenticationException e) {
            throw new RuntimeException("Invalid email or password!");
        }
    }
}


