package com.ohgiraffers.childprotectproject.angel.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/angel")
public class AngelController {

    @GetMapping("/angel")
    public String showAngelPage(Model model) {
        // 필요 시 모델에 데이터 추가
        // 예: model.addAttribute("attributeName", attributeValue);
        return "angel/angel"; // templates/manual/manual.html
    }
}

