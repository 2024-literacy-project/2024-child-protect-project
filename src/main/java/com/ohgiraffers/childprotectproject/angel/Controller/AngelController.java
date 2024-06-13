package com.ohgiraffers.childprotectproject.angel.Controller;

import com.ohgiraffers.childprotectproject.member.DTO.MemberDTO;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/angel")
public class AngelController {

//    @GetMapping("/angel")
//    public String showAngelPage(Model model) {
//        // 필요 시 모델에 데이터 추가
//        // 예: model.addAttribute("attributeName", attributeValue);
//        return "angel/angel"; // templates/manual/manual.html
//    }

    @GetMapping("/angel")
    public String showAngelPage(HttpSession session, Model model) {
        // 세션에서 로그인한 사용자 정보를 가져옴
        MemberDTO loggedInUser = (MemberDTO) session.getAttribute("loggedInUser");
        if (loggedInUser != null) {
            // 로그인한 사용자 ID를 모델에 추가
            model.addAttribute("member_id", loggedInUser.getMember_id());
        }
        // 필요 시 추가 데이터를 모델에 추가
        return "angel/angel"; // templates/angel/angel.html
    }

}

