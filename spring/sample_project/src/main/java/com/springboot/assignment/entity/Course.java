package com.springboot.assignment.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public @Data class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private int id;


    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    @Column(name = "course_name",nullable = false,unique = true)
    private String courseName;

    @NotNull(message = "is required")
    @Size(min = 5,message = "size must be 5")
    @Pattern(regexp = "^[CS].*",message = "start with CS")
    @Column(name = "course_code" , nullable = false ,unique = true)
    private String courseCode;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH
                                                   ,CascadeType.PERSIST})
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> students;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
