package com.week5.pharmacy.controller;


import java.util.List;

import com.week5.pharmacy.exception.ResourceNotFoundException;
import com.week5.pharmacy.model.student;
import com.week5.pharmacy.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://8080")
@RestController
@RequestMapping("/api/students")
public class controller {
    @Autowired
    private StudentRepository studentRepository;

    // get all employees
    @GetMapping("/getAllStudent")
    public List<student> getAllStudents() {
        return studentRepository.findAll();
    }

    // create employee rest api
    @PostMapping("/addStudent")
    public student createStudent(@RequestBody student student) {
        return studentRepository.save(student);
    }

    // get employee by id rest api
    @GetMapping("/getById/{id}")
    public ResponseEntity<student> getStudentById(@PathVariable Long id) {
        student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not exist with id :" + id));
        return ResponseEntity.ok(student);
    }

}
