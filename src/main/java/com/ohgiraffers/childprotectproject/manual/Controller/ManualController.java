package com.ohgiraffers.childprotectproject.manual.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ManualController {

    @GetMapping("/manual")
    public String showManualPage(Model model) {
        // 필요 시 모델에 데이터 추가
        // 예: model.addAttribute("attributeName", attributeValue);
        return "manual/manual"; // templates/manual/manual.html
    }
}
