package com.ohgiraffers.childprotectproject.member.Controller;

import com.ohgiraffers.childprotectproject.member.DTO.MemberDTO;
import com.ohgiraffers.childprotectproject.member.Service.MemberService;
import com.ohgiraffers.childprotectproject.member.Service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberServiceImpl memberServiceImpl;

    @PostMapping
    public ResponseEntity<MemberDTO> createMember(@RequestBody MemberDTO member) {
        MemberDTO createdMember = memberServiceImpl.createMember(member);
        return new ResponseEntity<>(createdMember, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MemberDTO> getMemberById(@PathVariable("id") String member_id) {
        MemberDTO member = memberServiceImpl.getMemberById(member_id);
        return new ResponseEntity<>(member, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<MemberDTO>> getAllMembers() {
        List<MemberDTO> members = memberServiceImpl.getAllMembers();
        return new ResponseEntity<>(members, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MemberDTO> updateMember(@PathVariable("id") int member_no, @RequestBody MemberDTO member) {
        MemberDTO updatedMember = memberServiceImpl.updateMember(member_no, member);
        return new ResponseEntity<>(updatedMember, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMember(@PathVariable("id") int member_no) {
        memberServiceImpl.deleteMember(member_no);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
