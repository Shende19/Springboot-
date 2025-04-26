package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.entity.employeeEntity;
import com.example.employeemanagementsystem.repository.employeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class employeeService {

    @Autowired

    public employeeRepo EmployeeRepo;

    //post method
    public employeeEntity createEntity(employeeEntity employeeEntityDetails)
    {
        return EmployeeRepo.save(employeeEntityDetails);
    }
    //get method

   public List<employeeEntity> getAllRecord( )
    {
        return EmployeeRepo.findAll();
    }

   public employeeEntity getAllRecord(long id)
   {
        Optional<employeeEntity> getRecord=EmployeeRepo.findById(id);
       return getRecord.orElse(null);
   }

   //put method

    public employeeEntity updateEntity(employeeEntity employeeEntity)
    {
        return EmployeeRepo.save(employeeEntity);
    }
    //or


    //delete method
    public void deleteEntity(long id)
    {
        EmployeeRepo.deleteById(id);
    }


}
