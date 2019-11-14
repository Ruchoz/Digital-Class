package com.example.Digital.Class.controller;

import com.example.Digital.Class.model.Student;

import com.example.Digital.Class.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "digital")
public class HomeController {
    @Autowired
    private StudentDao studentDao;

    @RequestMapping(value = "signup")
    public String displaySignUp() {
        return "signup";
    }

    @RequestMapping (value ="signup" ,method= RequestMethod.POST)
    public String processSignUp(Model model, @ModelAttribute@Valid Student student, Errors errors) {
        if (errors.hasErrors()) {
            return "signup";
        }

        studentDao.save(student);
        return "signin";
        }

    @RequestMapping ( value = "signin")
    public String displaysignin(){

        return "signin";
    }
}
