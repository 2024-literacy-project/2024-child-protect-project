package com.ohgiraffers.childprotectproject.member.Service;

import com.ohgiraffers.childprotectproject.member.DTO.MemberDTO;
import com.ohgiraffers.childprotectproject.member.common.UserRole;

import java.util.List;

public interface MemberService {
    MemberDTO createMember(MemberDTO member);
    MemberDTO getMemberById(String member_id);
    List<MemberDTO> getAllMembers();

    MemberDTO updateMember(int member_no, MemberDTO member);
    void deleteMember(int member_no);
    UserRole getMemberRole(int member_no);
}
