package com.ohgiraffers.childprotectproject.member.Service;

import com.ohgiraffers.childprotectproject.member.DTO.MemberDTO;
import com.ohgiraffers.childprotectproject.member.common.UserRole;

import java.util.List;

public interface MemberService {
    boolean registerMember(MemberDTO member);
    MemberDTO login(String memberId, String password);
    List<MemberDTO> getAllMembers();
    MemberDTO getMemberById(String memberId);
    boolean updateMember(MemberDTO member);
    boolean deleteMember(int memberNo);
    UserRole getMemberRole(int memberNo);
    MemberDTO selectMemberById(String memberId);
}