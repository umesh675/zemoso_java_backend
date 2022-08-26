package com.springboot.assignment;

import com.springboot.assignment.entity.Course;
import com.springboot.assignment.repo.CourseRepo;
import com.springboot.assignment.service.course.CourseService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CourseTest {

    @MockBean
    private CourseRepo repo;

    @Autowired
    private CourseService service;

    @Test
    public void testSave(){

        Course course = Course.builder()
                .courseCode("CS105")
                .courseName("Bio")
                .build();

        Mockito.when(repo.save(course)).thenReturn(course);

        assertEquals(course,service.save(course));
    }

    @Test
    public void testFindById(){

        int id = 1;

        Mockito.when(repo.findById(id)).thenReturn(null);

        assertEquals(null,service.findById(id));
    }


    @Test
    public void testFindAll(){

        Mockito.when(repo.findAll()).thenReturn(Stream
                .of(Course.builder()
                        .courseCode("CS110")
                        .courseName("BIO").build()).collect(Collectors.toList()));

        assertEquals(1,service.findAll().size());
    }

    @Test
    public void testDelete(){

        service.deleteById(1);
        Mockito.verify(repo,Mockito.times(1)).deleteById(1);
    }


}
