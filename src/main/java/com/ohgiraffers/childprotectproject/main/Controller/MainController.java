package com.ohgiraffers.childprotectproject.main.Controller;

import com.ohgiraffers.childprotectproject.member.DTO.MemberDTO;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String showMainPage(HttpSession session, Model model){
        MemberDTO loggedInUser = (MemberDTO) session.getAttribute("loggedInUser");
        if (loggedInUser != null){
            model.addAttribute("member_id", loggedInUser.getMember_id());
        }
        return "main/main";
    }

}
