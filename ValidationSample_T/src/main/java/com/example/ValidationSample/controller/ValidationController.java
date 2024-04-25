package com.example.ValidationSample.controller;

import com.example.ValidationSample.form.CalcForm;
import com.example.ValidationSample.validator.CalcValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ValidationController {
    @ModelAttribute
    public CalcForm setUpForm() {
        return new CalcForm();
    }
    @GetMapping("show")
    public String showView() {
        return "entry";
    }

    @PostMapping("calc")
    public String confirmView(@Validated CalcForm form,
                              BindingResult bindingResult, Model model) {
        // 입력 체크에서 에러가 발생한 경우
        if (bindingResult.hasErrors()) {
            // 입력 화면으로
            return "entry";
        }

        // 값 더하기
        Integer result = form.getLeftNum() + form.getRightNum();

        // Model에 저장
        model.addAttribute("result", result);

        // 확인 화면으로
        return "confirm";
    }

    @Autowired
    CalcValidator calcValidator;

    /** 커스텀 유효성 검사기 등록 */
    @InitBinder("calcForm")
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.addValidators(calcValidator);
    }
}
