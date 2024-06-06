package com.ohgiraffers.childprotectproject.member.Service;

import com.ohgiraffers.childprotectproject.member.DTO.MemberDTO;
import com.ohgiraffers.childprotectproject.member.DTO.MemberDAO;
import com.ohgiraffers.childprotectproject.member.common.UserRole;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDAO memberDAO;

    @Override
    public MemberDTO createMember(MemberDTO member) {
        int insertedMemberNo = memberDAO.insertMember(member);
        member.setMember_no(insertedMemberNo);
        return member;
    }

    @Override
    public MemberDTO getMemberById(String member_id) {
        return memberDAO.selectMemberById(member_id);
    }

    @Override
    public List<MemberDTO> getAllMembers() {
        return memberDAO.selectAllMembers();
    }

    @Override
    public MemberDTO updateMember(int member_no, MemberDTO member) {
        member.setMember_no(member_no);
        memberDAO.updateMember(member);
        return member;
    }

    @Override
    public void deleteMember(int member_no) {
        memberDAO.deleteMember(member_no);
    }

    @Override
    public UserRole getMemberRole(int member_no) {
        return memberDAO.getMemberRole(member_no);
    }
}
