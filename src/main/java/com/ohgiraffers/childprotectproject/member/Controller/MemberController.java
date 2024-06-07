package com.ohgiraffers.childprotectproject.member.Controller;

import com.ohgiraffers.childprotectproject.member.DTO.MemberDTO;
import com.ohgiraffers.childprotectproject.member.Service.MemberService;
import com.ohgiraffers.childprotectproject.member.Service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @PostMapping
    public String addMember(@RequestBody MemberDTO member) {
        boolean result = memberServiceImpl.registerMember(member);
        return result ? "Member registration successful" : "Member registration failed";
    }

    @PostMapping("/login")
    public MemberDTO login(@RequestParam String member_id, @RequestParam String member_pw) {
        return memberServiceImpl.login(member_id, member_pw);
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
