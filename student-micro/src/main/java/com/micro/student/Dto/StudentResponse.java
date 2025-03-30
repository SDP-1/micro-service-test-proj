package com.micro.student.Dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentResponse {
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private Integer schoolId;

    //came from general model
    private String uuid;
    private Date updatedAt;
    private Date createdAt;
}

