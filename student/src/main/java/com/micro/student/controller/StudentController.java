package com.micro.student.controller;

import com.micro.student.Dto.StudentRequest;
import com.micro.student.Dto.StudentResponse;
import com.micro.student.Service.StudentService;
import com.micro.student.mapper.StudentMapper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @Autowired
    private Environment environment;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<StudentResponse> save(
           @Valid @RequestBody StudentRequest studentReq
    ) {
         return ResponseEntity.ok(StudentMapper.toResponse(service.saveStudent(StudentMapper.toRequest(studentReq))));
    }

    @GetMapping
    public ResponseEntity<List<StudentResponse>> findAllStudents() {
        System.out.println(environment.getProperty("local.server.port"));
        return ResponseEntity.ok(StudentMapper.toResponse(service.findAllStudents()));
    }

    @GetMapping("/school/{school-id}")
    public ResponseEntity<List<StudentResponse>> findAllStudents(
            @PathVariable("school-id") Integer schoolId
    ) {
        return ResponseEntity.ok(StudentMapper.toResponse(service.findAllStudentsBySchool(schoolId)));
    }
}