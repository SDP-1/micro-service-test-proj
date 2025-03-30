package com.micro.school.DTO;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SchoolResponse {

    private Integer id;
    private String name;
    private String email;

    //came from genaral modal
    private String uuid;
    private Date createAt;
    private Date updateAt;
}
