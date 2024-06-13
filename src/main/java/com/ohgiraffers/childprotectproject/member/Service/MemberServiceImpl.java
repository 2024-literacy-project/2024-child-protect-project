package com.ohgiraffers.childprotectproject.member.Service;

import com.ohgiraffers.childprotectproject.member.DTO.MemberDTO;
import com.ohgiraffers.childprotectproject.member.DTO.MemberDAO;
import com.ohgiraffers.childprotectproject.member.common.UserRole;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MemberServiceImpl implements MemberService {

    private final MemberDAO memberDAO;

    @Autowired
    public MemberServiceImpl(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    /* 로그인 */
//    @Override
//    public MemberDTO login(String member_id, String member_pw) {
//        MemberDTO member = memberDAO.selectMemberById(member_id);
//        if (member != null && member.getMember_pw().equals(member_pw)) {
//            return member;
//        }
//        return null;
//    }
    @Override
    public MemberDTO login(String member_id, String member_pw) {
        return memberDAO.findByMemberIdAndPassword(member_id, member_pw);
    }

    // ----------------------------------------
    /* 회원가입 */
//    @Override
//    public boolean registerMember(MemberDTO member) {
//        return memberDAO.insertMember(member) == 1;
//    }
    @Override
    public boolean registerMember(MemberDTO member) {
        return memberDAO.saveMember(member) > 0;
    }

    // ----------------------------------------
    /* 사용자리스트 (관리자용) */
    // 보기
    @Override
    public List<MemberDTO> getAllMemberList(){
        return memberDAO.getAllMemberList();
    }
    // 수정
    @Override
    public void updateMember(MemberDTO member){
        memberDAO.updateMember(member);
    }
    // 특정 id로 조회
    @Override
    public Optional<MemberDTO> findByMemberId(String member_id){
        MemberDTO memberDTO = memberDAO.findByMemberId(member_id);
        return Optional.ofNullable(memberDTO);
    }

    // 삭제
    @Override
    public void deleteMember(String member_id){
        memberDAO.deleteMember(member_id);
    }


    // ----------------------------------------

}
