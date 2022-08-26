package com.springboot.assignment.repo;

import com.springboot.assignment.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {

    public Course findByCourseCode(String courseCode); //spring provide automatic this

    public Course findById(int id);
}
