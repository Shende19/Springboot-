package com.example.employeemanagementsystem.dto;

public class jwtResponse {

    private String token;

    public jwtResponse() {}

    public jwtResponse(String token) {
        this.token = token;
    }

    // Getter and Setter
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}


