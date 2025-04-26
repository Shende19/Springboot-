package com.example.employeemanagementsystem.controller;

import com.example.employeemanagementsystem.entity.employeeEntity;
import com.example.employeemanagementsystem.service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private employeeService employeeService;

    @PostMapping("/employeeDetails")
    public ResponseEntity<employeeEntity> createEntity (@RequestBody employeeEntity employeeEntityDetails)
    {
        employeeEntity employee=  employeeService.createEntity(employeeEntityDetails);
       return ResponseEntity.ok( employee);
    }

    // get method
    @GetMapping("/employeeAllDetails")
    public ResponseEntity<List<employeeEntity>>getAllRecord()
    {
        List<employeeEntity> list=employeeService.getAllRecord();
        return ResponseEntity.ok(list);
    }
   @GetMapping("/getAllEmployeeDetails")
     public employeeEntity getAllRecord(@RequestParam long id)
     {
         return employeeService.getAllRecord(id);
     }

     //put method
    @PutMapping("/updateEmployeeDetails")
    public ResponseEntity<employeeEntity> updateEntity(@RequestBody employeeEntity employeeEntity)
    {
        employeeEntity updateData=employeeService.updateEntity(employeeEntity);
        return ResponseEntity.ok(updateData);
    }

    //delete method
    @DeleteMapping("/deleteEmployeeData")
    public ResponseEntity<String> deleteEntity(@RequestParam long id)
    {
        employeeService.deleteEntity(id);
         return ResponseEntity.ok("delete data successfully");
    }



}
