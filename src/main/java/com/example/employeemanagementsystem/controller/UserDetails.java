package com.example.employeemanagementsystem.controller;


import com.example.employeemanagementsystem.dto.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetails {

    @PostMapping("/addUser")
    public String getUserDeatils(@RequestBody User user)
    {
        String name=user.getName();
        String email=user.getEmail();
        return  ("User " + name + " with email " + email + " has been added successfully.");

    }

}
//output of program
// response body: User kanchan with email kanchanshende19@gmail.com has been added successfully.
//URL: http://localhost:8080/addUser
//request : POST
//request body:{
//     "email":"kanchanshende19@gmail.com",
//     "name":"kanchan"
// }
