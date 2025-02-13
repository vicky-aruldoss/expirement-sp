package com.example.sptutorial.service.impl;

import com.example.sptutorial.model.Student;
import com.example.sptutorial.service.contracts.StudentServiceContract;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements StudentServiceContract {
    @Override
    public Student[] GetAllStudents() {
        var students = new Student(10,"Vicky Aruldoss");
        return new Student[]{students};
    }
}
