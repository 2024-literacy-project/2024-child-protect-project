package com.ohgiraffers.childprotectproject.member.DTO;

import com.ohgiraffers.childprotectproject.member.common.UserRole;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface MemberDAO {


        /* 로그인 기능에 사용 */
        MemberDTO findByMemberIdAndPassword(@Param("member_id") String member_id, @Param("member_pw") String member_pw);


        /* 회원가입 */
//        @Insert("INSERT INTO members (member_id, member_pw, member_name, member_phone) VALUES (#{member_id}, #{member_pw}, #{member_name}, #{member_phone})")
//        int saveMember(MemberDTO member);
        int saveMember(MemberDTO member);

        //

        int insertMember(MemberDTO member);

        MemberDTO selectMemberById(String member_id);
        List<MemberDTO> selectAllMembers();

        int updateMember(MemberDTO member);

        int deleteMember(int member_no);
        UserRole getMemberRole(int member_no);
        MemberDTO getMemberById(String member_id);
}
