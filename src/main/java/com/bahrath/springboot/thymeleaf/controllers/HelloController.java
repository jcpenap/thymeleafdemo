package com.bahrath.springboot.thymeleaf.controllers;

import com.bahrath.springboot.thymeleaf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @RequestMapping("/sendData")
    public ModelAndView sendData() {
        ModelAndView modelAndView = new ModelAndView("data");
        modelAndView.addObject("message", "Take up one idea and make it your life");
        return modelAndView;
    }

    @RequestMapping("/student")
    public ModelAndView getStudent() {
        ModelAndView modelAndView = new ModelAndView("student");
        Student student = new Student();
        student.setName("Jhon");
        student.setScore(80);
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @RequestMapping("/students")
    public ModelAndView getStudents() {
        ModelAndView modelAndView = new ModelAndView("students");

        Student student = new Student();
        student.setName("Jhon");
        student.setScore(80);

        Student student2 = new Student();
        student2.setName("Bob");
        student2.setScore(90);

        List<Student> students = Arrays.asList(student, student2);

        modelAndView.addObject("students", students);
        return modelAndView;
    }

    @RequestMapping("/studentForm")
    public ModelAndView getStudentForm() {
        ModelAndView modelAndView = new ModelAndView("studentForm");
        Student student = new Student();
        student.setName("Jhon");
        student.setScore(80);
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @RequestMapping("/saveStudent")
    public ModelAndView saveStudent(@ModelAttribute Student student) {
        ModelAndView modelAndView = new ModelAndView("result");
        System.out.println(student.getName());
        System.out.println(student.getScore());
        return modelAndView;
    }

}
