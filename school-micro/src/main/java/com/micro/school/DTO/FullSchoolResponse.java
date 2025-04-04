package com.micro.school.DTO;

import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FullSchoolResponse {

    private String name;
    private String email;
    List<StudentResponse> students;
}

