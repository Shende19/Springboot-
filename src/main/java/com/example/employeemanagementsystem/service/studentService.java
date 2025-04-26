package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.dto.studentDto;
import com.example.employeemanagementsystem.entity.studentEntity;
import com.example.employeemanagementsystem.repository.studentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentService {

    @Autowired
    private  studentRepo StudentRepo;


    public studentEntity createStudent(studentDto StudentDto)
    {
        studentEntity StudentEntity =new studentEntity();
        StudentEntity.setStudentFirstName(StudentDto.getStudentFirstName());
        StudentEntity.setStudentLastName(StudentDto.getStudentLastName());
        StudentEntity.setDob (StudentDto.getDob());
        StudentEntity.setGender (StudentDto.getGender ());
        StudentEntity.setEmail(StudentDto.getEmail());
        StudentEntity.setMobileNo(StudentDto.getMobileNo());
        StudentEntity.setStudentAdd(StudentDto.getStudentAdd() );
        StudentEntity.setEnrollmentDate(StudentDto.getEnrollmentDate());

        return StudentRepo.save(StudentEntity);
    }

    public List<studentEntity> getAllStudent()
    {
        return StudentRepo.findAll();
    }

    //for updating data

    public String updateStudent(long rollNo,studentEntity StudentEntity)
    {
        Optional<studentEntity> optionalStudentEntity=StudentRepo.findById(rollNo);
        if(optionalStudentEntity.isPresent())
        {
            studentEntity studentrecord=optionalStudentEntity.get();
            studentrecord.setStudentFirstName(StudentEntity.getStudentFirstName());
            studentrecord.setStudentLastName(StudentEntity.getStudentLastName());
            studentrecord.setEmail(StudentEntity.getEmail());
            studentrecord.setMobileNo(StudentEntity.getMobileNo());
            studentrecord.setStudentAdd(StudentEntity.getStudentAdd());
            studentrecord.setEnrollmentDate(StudentEntity.getEnrollmentDate());

            StudentRepo.save(studentrecord);
            return "updated data successfully";

        }
        else
            return "student do not find with id :"+rollNo;
    }

}
