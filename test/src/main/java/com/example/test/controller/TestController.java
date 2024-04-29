package com.example.test.controller;

import com.example.test.entity.Test;
import com.example.test.form.TestForm;
import com.example.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestService service;

    @ModelAttribute
    public TestForm setUpForm() {
        TestForm form = new TestForm();
        form.setAnswer(true);
        return form;
    }

    @GetMapping
    public String showList(TestForm testForm, Model model) {
        testForm.setNewTest(true);
        Iterable<Test> list = service.selectAll();

        model.addAttribute("list", list);
        model.addAttribute("title", "등록 폼");

        return "crud";
    }
}
