package com.example.sptutorial.controller;

import com.example.sptutorial.model.Student;
import com.example.sptutorial.service.contracts.StudentServiceContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    public StudentServiceContract _studentServiceContract;
    @Autowired
    public StudentController(StudentServiceContract studentServiceContract) {
     _studentServiceContract = studentServiceContract;
    }

    @GetMapping("/student-details")
    public Student[] studentDetails() {
        return _studentServiceContract.GetAllStudents();
    }
}
