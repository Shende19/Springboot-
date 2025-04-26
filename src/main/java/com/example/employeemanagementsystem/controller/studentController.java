package com.example.employeemanagementsystem.controller;
import com.example.employeemanagementsystem.dto.studentDto;
import com.example.employeemanagementsystem.entity.studentEntity;
import com.example.employeemanagementsystem.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/studentData")
public class studentController {

    @Autowired
    private studentService Studentservice;

    //create Api
    @PostMapping("/addStudentData")
    public ResponseEntity<studentEntity> createStudent(@RequestBody studentDto StudentDto)
    {
        studentEntity student =Studentservice.createStudent(StudentDto);
        return ResponseEntity.ok(student);

    }
    //get all records
    @GetMapping("/getAllRecord")
    public ResponseEntity<List<studentEntity>> getAllStudentRecord()
    {
        List<studentEntity> list=Studentservice.getAllStudent();
        return ResponseEntity.ok(list);

    }

//update record

    @PutMapping("/{rollNo}")
    public ResponseEntity<String> updatedStudent(@PathVariable Long rollNo, @RequestBody studentEntity StudentEntity )
    {
        String responseMessage=Studentservice.updateStudent(rollNo,StudentEntity);
        if (responseMessage.contains("successfully")) {
            // Return HTTP status 200 (OK) if the student was updated successfully
            return new ResponseEntity<>(responseMessage, HttpStatus.OK);
        } else {
            // Return HTTP status 404 (Not Found) if the student was not found
            return new ResponseEntity<>(responseMessage, HttpStatus.NOT_FOUND);
        }
    }


//get current date
@GetMapping("/date")
public String getCurrentDate()
{
    LocalDate currentDate=LocalDate.now();
    return "current date :"+currentDate;
}
//get previous date
    @GetMapping("/previousdate")
    public String getPreviousDate()
    {
        LocalDate previousDate=LocalDate.now().minusDays(1);
        return "yesterday date is: "+previousDate;

    }
//get future date
@GetMapping("/futuredate")
public String getFutureDate()
{
    LocalDate futureDate=LocalDate.now().plusDays(3);
    return "future date after three day is: "+futureDate;

}



}
