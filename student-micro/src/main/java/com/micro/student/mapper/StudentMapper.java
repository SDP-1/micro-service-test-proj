package com.micro.student.mapper;
import com.micro.student.Dto.StudentRequest;
import com.micro.student.Dto.StudentResponse;
import com.micro.student.model.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentMapper {

    public static Student toRequest(StudentRequest request) {
        return Student.builder()
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .schoolId(request.getSchoolId())
                .build();
    }

    public static StudentResponse toResponse(Student student) {
        return StudentResponse.builder()
                .id(student.getId())
                .uuid(student.getUuid())
                .firstname(student.getFirstname())
                .lastname(student.getLastname())
                .email(student.getEmail())
                .schoolId(student.getSchoolId())
                .createdAt(student.getCreatedAt())
                .updatedAt(student.getUpdatedAt())
                .build();
    }

    public static List<StudentResponse> toResponse(List<Student> students) {
        return students.stream()
                .map(StudentMapper::toResponse)
                .collect(Collectors.toList());
    }

    public static List<Student> toRequest(List<StudentRequest> requests) {
        return requests.stream()
                .map(StudentMapper::toRequest)
                .collect(Collectors.toList());
    }
}

