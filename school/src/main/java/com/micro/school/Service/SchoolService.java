package com.micro.school.Service;

import com.micro.school.Config.StudentClient;
import com.micro.school.DTO.FullSchoolResponse;
import com.micro.school.Repository.SchoolRepository;
import com.micro.school.model.School;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    @Autowired
    private  SchoolRepository repository;

    @Autowired
    private  StudentClient client;

    public School saveSchool(School school) {
        return repository.save(school);
    }

    public List<School> findAllSchools() {
        return repository.findAll();
    }

    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
        var school = repository.findById(schoolId)
                .orElse(
                        School.builder()
                                .name("NOT_FOUND")
                                .email("NOT_FOUND")
                                .build()
                );
        var students = client.findAllStudentsBySchool(schoolId);
        return FullSchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}