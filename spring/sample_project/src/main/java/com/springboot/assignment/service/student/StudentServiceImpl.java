package com.springboot.assignment.service.student;

import com.springboot.assignment.entity.Student;
import com.springboot.assignment.repo.CourseRepo;
import com.springboot.assignment.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private CourseRepo courseRepo;

    @Override
    public Student findById(int id) {

       return studentRepo.findById(id);
    }

    @Override
    public List<Student> findAll() {

        return studentRepo.findAll();
    }

    @Override
    public Student save(Student student) {

        Student student1 = studentRepo.findById(student.getId());

        if(student1 == null){

            checkValid(student.getFirstName(), student.getLastName());

            student.setCourses(courseRepo.findAll());
        }

        else{
            checkUpdateValid(student);
        }

        return studentRepo.save(student);
    }


    @Override
    public void deleteById(int id) {

        studentRepo.deleteById(id);
    }

    public void checkUpdateValid(Student student){

        Student student1 = studentRepo.findById(student.getId());

        String firstName = "";
        String lastName = "";

        if(!student1.getFirstName().equals(student.getFirstName()))
            firstName = student.getFirstName();

        if(!student1.getLastName().equals(student.getLastName())){
            lastName = student.getLastName();
        }

        if(firstName.equals("")&& !lastName.equals("")){
            firstName = student.getFirstName();
        }
        if(!firstName.equals("") && lastName.equals(""))
            lastName = student.getLastName();

        checkValid(firstName, lastName);

    }

    public void checkValid(String firstName,String lastName){

        if(studentRepo.findByFirstNameAndLastName(firstName,lastName) != null) {
            throw new RuntimeException("First Name && last name both exist");
        }
    }



}
