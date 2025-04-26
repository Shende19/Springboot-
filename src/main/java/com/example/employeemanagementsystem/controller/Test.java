package com.example.employeemanagementsystem.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/name")
    public String getName() {

        return "Kanchan";

    }


}
//output
//GET:  http://localhost:8080/name
//Kanchan