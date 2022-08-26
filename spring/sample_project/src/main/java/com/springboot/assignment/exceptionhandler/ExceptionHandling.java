package com.springboot.assignment.exceptionhandler;

import com.springboot.assignment.entity.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandling {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> exceptionHandler(Exception exp){

        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                exp.getMessage(),
                System.currentTimeMillis()
        );

        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }
}
