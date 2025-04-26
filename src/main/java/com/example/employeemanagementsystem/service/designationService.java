package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.entity.designationEntity;
import com.example.employeemanagementsystem.repository.designationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class designationService {

    @Autowired
    designationRepo designationRepo;

    // post method
    public designationEntity createDesignation(designationEntity designationEntityObject)
    {
        return designationRepo.save(designationEntityObject);
    }

    //get method
    public designationEntity getDesignationdetailsdata(Long employeeID)
    {
        Optional<designationEntity> designation=designationRepo.findById(employeeID);
        return designation.orElse(null);
    }
    //put method

    public designationEntity getDesignationUpdate(designationEntity designationEntity)
    {
        return  designationRepo.save(designationEntity);

    }
    //delete method
    public  void deleteDesignationData(Long employeeID)
    {
        designationRepo.deleteById(employeeID);
    }
}
