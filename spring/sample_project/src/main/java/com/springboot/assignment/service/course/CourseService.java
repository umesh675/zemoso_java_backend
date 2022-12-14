package com.springboot.assignment.service.course;
import com.springboot.assignment.entity.Course;

import java.util.List;

public interface CourseService {

    public Course findById(int id);

    public List<Course> findAll();

    public Course save(Course course);

    public void deleteById(int id);

}
