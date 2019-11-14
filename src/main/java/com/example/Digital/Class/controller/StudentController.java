package com.example.Digital.Class.controller;



import com.example.Digital.Class.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Student")
public class StudentController {

    @Autowired
    StudentDao studentDao;

    public String index(Model model) {

        model.addAttribute("students", studentDao.findAll());
        model.addAttribute("title", "student");

        return "student/index";
    }
}
