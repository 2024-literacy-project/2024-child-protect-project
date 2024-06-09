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
    @Override
    public List<MemberDTO> getAllMembers() {
        return memberDAO.selectAllMembers();
    }

    @Override
    public MemberDTO getMemberById(String member_id) {
        return memberDAO.selectMemberById(member_id);
    }

    @Override
    public boolean updateMember(MemberDTO member) {
        return memberDAO.updateMember(member) == 1;
    }

    @Override
    public boolean deleteMember(int member_no) {
        return memberDAO.deleteMember(member_no) == 1;
    }

    @Override
    public UserRole getMemberRole(int member_no) {
        return memberDAO.getMemberRole(member_no);
    }

    @Override
    public MemberDTO selectMemberById(String member_id) {
        // Implementation matches the getMemberById method, assuming they perform the same action.
        return memberDAO.getMemberById(member_id);
    }
}
