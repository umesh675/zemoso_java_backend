package com.springboot.assignment.controller;

import com.springboot.assignment.entity.Student;
import com.springboot.assignment.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){

        StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);

        dataBinder.registerCustomEditor(String.class,trimmerEditor);

    }

    @GetMapping("/list")
    public String getStudents(Model model){

        List<Student> studentList = studentService.findAll();

        model.addAttribute("students",studentList);

        return "student-list";
    }

    @GetMapping("/get/{id}")
    public Student getStudent(@PathVariable int id){

        if(studentService.findById(id) == null)
            throw new RuntimeException("id "+id+" does not exist");

        return studentService.findById(id);
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){

        model.addAttribute("student",new Student());

        return "student-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("studentId") int id, Model model){

        Student student = studentService.findById(id);

        model.addAttribute("student",student);

        return "student-form";
    }
    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("student") Student student, BindingResult result){

        if(result.hasErrors())
            return "student-form";

        studentService.save(student);

        return "redirect:/student/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("studentId") int id,Model model){

        if(studentService.findById(id) == null)
            throw new RuntimeException("id "+id+" does not exist");

        studentService.deleteById(id);
        return "redirect:/student/list";
    }
}
