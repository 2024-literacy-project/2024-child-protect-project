package com.ohgiraffers.childprotectproject.member.DTO;

import com.ohgiraffers.childprotectproject.member.common.UserRole;

import java.util.List;

public interface MemberDAO {

        int insertMember(MemberDTO member);

        MemberDTO selectMemberById(String member_id);
        List<MemberDTO> selectAllMembers();

        int updateMember(MemberDTO member);

        int deleteMember(int member_no);
        UserRole getMemberRole(int member_no);

}
