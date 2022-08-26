package com.springboot.assignment.service.student;

import com.springboot.assignment.entity.Student;

import java.util.List;

public interface StudentService {

    public Student findById(int id);

    public List<Student> findAll();

    public Student save(Student student);

    public void deleteById(int id);

}
