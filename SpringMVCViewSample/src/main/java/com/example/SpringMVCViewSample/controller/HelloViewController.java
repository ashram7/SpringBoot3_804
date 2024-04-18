package com.example.SpringMVCViewSample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
//@RequestMapping(value = "hello")
//@RequestMapping("hello")
//@RequestMapping(value = { "hello", "hellospring" })
//@RequestMapping(value = "hello", method = RequestMethod.GET)
//@RequestMapping(value = "hello", method = { RequestMethod.GET, RequestMethod.POST })
public class HelloViewController {
    @GetMapping("view")
    public String helloView() {
        return "hello";
    }
}
//문제) http://localhost:8080/hello/view2를 입력하면 morning가 출력되게 만들어 보세요.