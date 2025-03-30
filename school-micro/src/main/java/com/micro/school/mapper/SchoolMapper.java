package com.micro.school.mapper;


import com.micro.school.DTO.SchoolRequest;
import com.micro.school.DTO.SchoolResponse;
import com.micro.school.model.School;

import java.util.List;
import java.util.stream.Collectors;

public class SchoolMapper {

    // Convert SchoolRequest to School entity
    public static School toRequest(SchoolRequest request) {
        return School.builder()
                .name(request.getName())
                .email(request.getEmail())
                .build();
    }

    // Convert School entity to SchoolResponse DTO
    public static SchoolResponse toResponse(School school) {
        return SchoolResponse.builder()
                .id(school.getId())
                .name(school.getName())
                .email(school.getEmail())
                .uuid(school.getUuid())
                .createAt(school.getCreatedAt())
                .updateAt(school.getUpdatedAt())
                .build();
    }

    // Convert a list of School entities to a list of SchoolResponse DTOs
    public static List<SchoolResponse> toResponse(List<School> schools) {
        return schools.stream()
                .map(SchoolMapper::toResponse)
                .collect(Collectors.toList());
    }
}

