package com.springboot.assignment;

import com.springboot.assignment.entity.Student;
import com.springboot.assignment.repo.StudentRepo;
import com.springboot.assignment.service.student.StudentService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class StudentTest {

    @Autowired
    private StudentService service;

    @MockBean
    private StudentRepo repo;

    @Test
    public void addStudent(){

        Student student = Student.builder().firstName("Rajesh")
                .lastName("Chandra")
                .email("rajesh@gmail.com")
                .build();

        Mockito.when(repo.save(student)).thenReturn(student);

        assertEquals(student,service.save(student));
    }

    @Test
    public void testFindById(){
        int id = 1;

        Student student = Student.builder()
                        .firstName("Ram").lastName("Chandra")
                        .email("ram@gmail.com").build();

        Mockito.when(repo.findById(id)).thenReturn(student);

        assertEquals(student,service.findById(id));

    }

    @Test
    public void testFindAll(){

        Mockito.when(repo.findAll()).thenReturn(Stream
                .of(Student.builder()
                        .firstName("Rajendra")
                        .lastName("Kumar")
                        .email("rajendra@gmail.com").build()).collect(Collectors.toList()));

        assertEquals(1,service.findAll().size());
    }

    @Test
    public void testDelete(){

        service.deleteById(1);

        Mockito.verify(repo,Mockito.times(1)).deleteById(1);
    }


}
