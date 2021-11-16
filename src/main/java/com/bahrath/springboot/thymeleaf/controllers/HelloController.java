package com.bahrath.springboot.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @RequestMapping("sendData")
    public ModelAndView sendData() {
        ModelAndView modelAndView = new ModelAndView("data");
        modelAndView.addObject("message", "Take up one idea and make it your life");
        return modelAndView;
    }
}
