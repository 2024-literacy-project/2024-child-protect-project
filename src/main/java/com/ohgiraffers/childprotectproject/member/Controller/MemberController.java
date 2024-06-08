package com.ohgiraffers.childprotectproject.member.Controller;

import com.ohgiraffers.childprotectproject.member.DTO.MemberDTO;
import com.ohgiraffers.childprotectproject.member.Service.MemberService;
import com.ohgiraffers.childprotectproject.member.Service.MemberServiceImpl;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/member")
public class MemberController{


    private final MemberServiceImpl memberServiceImpl;


    @Autowired
    public MemberController(MemberService memberService, MemberServiceImpl memberServiceImpl) {

        this.memberServiceImpl = memberServiceImpl;
    }

    /* ==== 로그인 ==== */
//    @PostMapping("/login")
//    public MemberDTO login(@RequestParam String member_id, @RequestParam String member_pw) {
//        return memberServiceImpl.login(member_id, member_pw);
//    }
    // 로그인 페이지 표시
    @GetMapping("/login")
    public String showLoginPage(HttpSession session) {
        if (session.getAttribute("loggedInUser") != null) {
            return "redirect:/member/main"; // 이미 로그인된 경우 메인 페이지로 리디렉션
        }
        return "member/login"; // 'login.html' 파일을 반환
    }
    // 로그인 처리
    @PostMapping("/login")
    public String login(@RequestParam String member_id, @RequestParam String member_pw, Model model, HttpSession session) {
        MemberDTO member = memberServiceImpl.login(member_id, member_pw);

        if (member != null) {
            session.setAttribute("loggedInUser", member);
            return "redirect:/member/main"; // 로그인 성공 시 메인 페이지로 리디렉션

        } else {
            model.addAttribute("loginError", "아이디나 비밀번호가 일치하지 않습니다.");
            return "member/login"; // 로그인 실패 시 다시 로그인 페이지
//            return "redirect:/member/login?error=true"; // 로그인 실패 시 로그인 페이지로 리디렉션, 에러 파라미터 추가
        }
    }
    // 메인 페이지 표시
    @GetMapping("/main")
    public String showMainPage(HttpSession session, Model model) {
        MemberDTO loggedInUser = (MemberDTO) session.getAttribute("loggedInUser");

        if (loggedInUser != null) {
            model.addAttribute("member_id", loggedInUser.getMember_id());
            return "member/main"; // 'main.html' 파일을 반환

        } else {
            return "redirect:/member/login"; // 로그인 안된 상태이면 로그인 페이지로 리디렉션
        }
    }
    // 로그아웃 처리
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate(); // 세션 무효화
        return "redirect:/member/login"; // 로그아웃 후 로그인 페이지로 리디렉션
    }

    // ----------------------------------------
    @PostMapping
    public String addMember(@RequestBody MemberDTO member) {
        boolean result = memberServiceImpl.registerMember(member);
        return result ? "Member registration successful" : "Member registration failed";
    }

    @GetMapping("/{member_id}")
    public MemberDTO getMember(@PathVariable String member_id) {
        return memberServiceImpl.getMemberById(member_id);
    }

    @GetMapping
    public List<MemberDTO> getAllMembers() {
        return memberServiceImpl.getAllMembers();
    }

    @PutMapping
    public String updateMember(@RequestBody MemberDTO member) {
        boolean result = memberServiceImpl.updateMember(member);
        return result ? "Member information update successful" : "Member information update failed";
    }

    @DeleteMapping("/{member_no}")
    public String deleteMember(@PathVariable int member_no) {
        boolean result = memberServiceImpl.deleteMember(member_no);
        return result ? "Member deletion successful" : "Member deletion failed";
    }
}