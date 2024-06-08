package com.ohgiraffers.childprotectproject.member.DTO;

import com.ohgiraffers.childprotectproject.member.common.UserRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberDAO {

        /* 로그인 기능에 사용 */
        MemberDTO findByMemberIdAndPassword(@Param("member_id") String member_id, @Param("member_pw") String member_pw);

        //

        int insertMember(MemberDTO member);

        MemberDTO selectMemberById(String member_id);
        List<MemberDTO> selectAllMembers();

        int updateMember(MemberDTO member);

        int deleteMember(int member_no);
        UserRole getMemberRole(int member_no);
        MemberDTO getMemberById(String member_id);
}
