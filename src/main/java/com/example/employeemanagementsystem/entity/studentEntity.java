package com.example.employeemanagementsystem.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="StudentInfo")
public class studentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long rollNo;
    private String studentFirstName;
    private String studentLastName;
    private int dob;
    @JsonProperty
    private String gender;
    @JsonProperty
    private String email;
    private int mobileNo;
    private String studentAdd;
    private int enrollmentDate;

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getStudentAdd() {
        return studentAdd;
    }

    public void setStudentAdd(String studentAdd) {
        this.studentAdd = studentAdd;
    }

    public int getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(int enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
}


