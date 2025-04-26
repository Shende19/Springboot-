package com.example.employeemanagementsystem.controller;

import com.example.employeemanagementsystem.entity.designationEntity;
import com.example.employeemanagementsystem.service.designationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/designation")
public class designationController {

    @Autowired
    designationService designationService;

    //Post Method
    @PostMapping("/postDesignationDetails")
    public ResponseEntity<designationEntity> createDesignationMethod(@RequestBody designationEntity designationEntityObject )
    {
        designationEntity designation=designationService.createDesignation(designationEntityObject);
        return ResponseEntity.ok(designation);
    }

    //get method

    @GetMapping("/getDesignationDetails/{id}")
    public designationEntity getDesignationdetails(@PathVariable("id") Long employeeID)
    {
        return designationService.getDesignationdetailsdata(employeeID);
    }

    //put method
    @PutMapping("/getDesignationUpdatedData")
    public  ResponseEntity<designationEntity> updateDesignation(@RequestBody designationEntity designationEntity)
    {
        designationEntity updateDesignation=designationService.getDesignationUpdate(designationEntity);
        return  ResponseEntity.ok(updateDesignation);
    }

    //delete method
    @DeleteMapping("/deleteDesignationData")
    public ResponseEntity<String> deleteDesignationEntityData(@RequestParam long employeeID)
    {
        designationService.deleteDesignationData(employeeID);
        return ResponseEntity.ok("data deleted successfully");
    }

}
