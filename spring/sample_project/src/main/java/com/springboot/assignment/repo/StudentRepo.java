package com.springboot.assignment.repo;

import com.springboot.assignment.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {

    public Student findById(int id);

    public Student findByFirstNameAndLastName(String firstName ,String lastName);
}
