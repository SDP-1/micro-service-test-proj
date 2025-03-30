package com.micro.school.Controller;

import com.micro.school.DTO.FullSchoolResponse;
import com.micro.school.DTO.SchoolResponse;
import com.micro.school.Service.SchoolService;
import com.micro.school.mapper.SchoolMapper;
import com.micro.school.model.School;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {

    @Autowired
    private SchoolService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public School save(
            @RequestBody School school
    ) {
        return service.saveSchool(school);
    }

    @GetMapping
    public ResponseEntity<List<SchoolResponse>> findAllSchools() {
        return ResponseEntity.ok(SchoolMapper.toResponse(service.findAllSchools()));
    }

    @GetMapping("/with-students/{school-id}")
    public ResponseEntity<FullSchoolResponse> findAllStudentsBySchoolId(
            @PathVariable("school-id") Integer schoolId
    ) {
        return ResponseEntity.ok(service.findSchoolsWithStudents(schoolId));
    }


}
