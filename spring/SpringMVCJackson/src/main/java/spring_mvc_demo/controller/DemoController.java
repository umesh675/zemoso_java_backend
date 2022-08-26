package spring_mvc_demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring_mvc_demo.entity.Student;

import spring_mvc_demo.entity.StudentNotFoundException;

import javax.annotation.PostConstruct;

import java.util.ArrayList;

import java.util.List;

@RestController
public class DemoController {

    private List<Student> studentList;

    //post construct define only once when a bean initialize
    @PostConstruct
    public void initList(){
        studentList = new ArrayList<>();
        studentList.add(new Student("Ram","Charan"));
        studentList.add(new Student("Raju","Roy"));
    }




    @GetMapping("/")
    public String helloWorld(){

        return "Hello World";
    }

    @GetMapping("/students")
    public List<Student> studentList(){

        return studentList;
    }

    @GetMapping("/student/{studentId}") //studentId should be match up with path variable
    public Student getStudent(@PathVariable int studentId){

        if(studentId<0 || studentId>=studentList.size()){
            throw new StudentNotFoundException("Student id not found - "+studentId);
        }
        return studentList.get(studentId);
    }
}
