package com.example.demo.controller;

import com.example.demo.form.Form;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RequestParamController {
    @GetMapping("show")
    public String showView() {
        return "entry";
    }

    @PostMapping("confirm")
    public String confirmView(Form f) {
        return "confirm2";
    }
}
