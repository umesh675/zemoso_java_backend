package com.springboot.assignment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "students", uniqueConstraints = @UniqueConstraint(columnNames = {"email"}))
@AllArgsConstructor
@NoArgsConstructor
@Builder
public @Data class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private int id;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    @Column(name = "first_name",nullable = false)
    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    @Column(name = "last_name",nullable = false)
    private String lastName;

    @NotNull(message = "is required")
    @Pattern(regexp = "^[\\w.+\\-]+@gmail\\.com$", message = "end with @gmail.com")
    @Column(name = "email", nullable = false)
    private String email;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY , cascade = {CascadeType.DETACH,CascadeType.MERGE,
                       CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
