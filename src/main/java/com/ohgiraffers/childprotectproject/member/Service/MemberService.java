package com.ohgiraffers.childprotectproject.member.Service;

import com.ohgiraffers.childprotectproject.member.DTO.MemberDTO;
import com.ohgiraffers.childprotectproject.member.common.UserRole;

import java.util.List;

public interface MemberService {
    boolean registerMember(MemberDTO member);
    MemberDTO login(String member_id, String member_pw);
    List<MemberDTO> getAllMembers();
    MemberDTO getMemberById(String member_id);
    boolean updateMember(MemberDTO member);
    boolean deleteMember(int member_no);
    UserRole getMemberRole(int member_no);
    MemberDTO selectMemberById(String member_id);
}