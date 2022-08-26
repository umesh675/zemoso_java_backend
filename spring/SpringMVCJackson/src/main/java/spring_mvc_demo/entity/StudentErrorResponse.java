package spring_mvc_demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public @Data class StudentErrorResponse {

    private int status;
    private String message;
    private long timeStamp;
}
