package com.ohgiraffers.childprotectproject.member.Service;

import com.ohgiraffers.childprotectproject.member.DTO.MemberDTO;
import com.ohgiraffers.childprotectproject.member.DTO.MemberDAO;
import com.ohgiraffers.childprotectproject.member.common.UserRole;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class MemberServiceImpl implements MemberService {

    private final MemberDAO memberDAO;

    @Autowired
    public MemberServiceImpl(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    @Override
    public boolean registerMember(MemberDTO member) {
        return memberDAO.insertMember(member) == 1;
    }

    @Override
    public MemberDTO login(String memberId, String password) {
        MemberDTO member = memberDAO.selectMemberById(memberId);
        if (member != null && member.getMember_pw().equals(password)) {
            return member;
        }
        return null;
    }

    @Override
    public List<MemberDTO> getAllMembers() {
        return memberDAO.selectAllMembers();
    }

    @Override
    public MemberDTO getMemberById(String memberId) {
        return memberDAO.selectMemberById(memberId);
    }

    @Override
    public boolean updateMember(MemberDTO member) {
        return memberDAO.updateMember(member) == 1;
    }

    @Override
    public boolean deleteMember(int memberNo) {
        return memberDAO.deleteMember(memberNo) == 1;
    }

    @Override
    public UserRole getMemberRole(int memberNo) {
        return memberDAO.getMemberRole(memberNo);
    }

    @Override
    public MemberDTO selectMemberById(String memberId) {
        return null;
    }
}
