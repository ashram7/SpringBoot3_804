package com.example.RequestParamSample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PathVariableController {
    @GetMapping("show")
    public String showView() {
        // 반환값으로 뷰 이름을 돌려줌
        return "show";
    }

    @GetMapping("/function/{no}")
    //@PathVariable Spring3에서 추가된 기능 중 하나로 말 그대로 URL 경로에 변수를 넣어주는것.
    public String selectFunction(@PathVariable Integer no) {
        // 뷰 이름을 초기화
        String view = null;
        switch (no) {
            case 1:
                view = "pathvaliable/function1";
                break;
            case 2:
                view = "pathvaliable/function2";
                break;
            case 3:
                view = "pathvaliable/function3";
                break;
        }

        // 반환값으로 뷰 이름을 돌려줌
        return view;
    }

    @PostMapping(value = "send", params = "a")
    public String showAView() {
        // 반환값으로 뷰 이름을 돌려줌
        return "submit/a";
    }
    /** 버튼 B 클릭 처리 */
    @PostMapping(value = "send", params = "b")
    public String showBView() {
        // 반환값으로 뷰 이름을 돌려줌
        return "submit/b";
    }
    /** 버튼 C 클릭 처리 */
    @PostMapping(value = "send", params = "c")
    public String showCView() {
        // 반환값으로 뷰 이름을 돌려줌
        return "submit/c";
    }

    @PostMapping(value = "send", params = "h")
    public String showHView() {
        // 반환값으로 뷰 이름을 돌려줌
        return "show";
    }
}
