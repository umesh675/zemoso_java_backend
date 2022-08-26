package com.springboot.assignment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public @Data class ErrorResponse {

    private int status;
    private String message;
    private long timeStamp;
}
