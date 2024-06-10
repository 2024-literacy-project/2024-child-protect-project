package com.ohgiraffers.childprotectproject.member.Service;

import com.ohgiraffers.childprotectproject.member.DTO.MemberDTO;
import com.ohgiraffers.childprotectproject.member.common.UserRole;

import java.util.List;
import java.util.Optional;

public interface MemberService {

    /* 로그인 */
    MemberDTO login(String member_id, String member_pw);

    /* 회원가입 */
    boolean registerMember(MemberDTO member);

    /* 사용자리스트 관리 (관리자용) */
    // 보기
    List<MemberDTO> getAllMemberList();
    // 수정
    void updateMember(MemberDTO member);

    // 특정 id로 조회
    Optional<MemberDTO> findByMemberId(String member_id);

    // 삭제
    void deleteMember(String member_id);


    //
//    boolean registerMember(MemberDTO member);

//    List<MemberDTO> getAllMembers();
//    MemberDTO getMemberById(String member_id);

//    boolean updateMember(MemberDTO member);
//    boolean deleteMember(int member_no);
    UserRole getMemberRole(int member_no);
    MemberDTO selectMemberById(String member_id);
}