package com.springboot.assignment.controller;

import com.springboot.assignment.entity.Course;
import com.springboot.assignment.service.course.CourseService;
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
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){

        StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);

        dataBinder.registerCustomEditor(String.class,trimmerEditor);

    }

    @GetMapping("/list")
    public String getStudents(Model model){

        List<Course> courseList = courseService.findAll();

        model.addAttribute("courses",courseList);

        return "course-list";
    }

    @GetMapping("/get/{id}")
    public Course getStudent(@PathVariable int id){

        if(courseService.findById(id) == null)
            throw  new RuntimeException(id+" does not exist");

        return courseService.findById(id);
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){

        model.addAttribute("course",new Course());

        return "course-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@Valid @RequestParam("courseId") int id,Model model){

        Course course = courseService.findById(id);

        model.addAttribute("course",course);

        return "course-form";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute Course course, BindingResult result){

        if(result.hasErrors())
            return "course-form";

        courseService.save(course);

        return "redirect:/course/list";
    }


    @GetMapping("/delete")
    public String delete(@RequestParam("courseId") int id , Model model){

        if(courseService.findById(id) == null)
            throw  new RuntimeException("id "+id+" does not exist");

        courseService.deleteById(id);

        return "redirect:/course/list";
    }
}
