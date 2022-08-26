package com.springboot.assignment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// DTO is used like when you need data from two entity you can use dto
@AllArgsConstructor
@NoArgsConstructor
public @Data class StudentCourseDTO {

    private String firstName;
    private String lastName;
    private String courseCode;
}

