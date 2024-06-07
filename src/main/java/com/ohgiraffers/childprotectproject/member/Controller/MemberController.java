package com.ohgiraffers.childprotectproject.member.Controller;

import com.ohgiraffers.childprotectproject.member.DTO.MemberDTO;
import com.ohgiraffers.childprotectproject.member.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController{

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public String addMember(@RequestBody MemberDTO member) {
        boolean result = memberService.registerMember(member);
        return result ? "Member registration successful" : "Member registration failed";
    }

    @PostMapping("/login")
    public MemberDTO login(@RequestParam String memberId, @RequestParam String password) {
        return memberService.login(memberId, password);
    }

    @GetMapping("/{memberId}")
    public MemberDTO getMember(@PathVariable String memberId) {
        return memberService.getMemberById(memberId);
    }

    @GetMapping
    public List<MemberDTO> getAllMembers() {
        return memberService.getAllMembers();
    }

    @PutMapping
    public String updateMember(@RequestBody MemberDTO member) {
        boolean result = memberService.updateMember(member);
        return result ? "Member information update successful" : "Member information update failed";
    }

    @DeleteMapping("/{memberNo}")
    public String deleteMember(@PathVariable int memberNo) {
        boolean result = memberService.deleteMember(memberNo);
        return result ? "Member deletion successful" : "Member deletion failed";
    }
}
