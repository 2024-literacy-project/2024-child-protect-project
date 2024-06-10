package com.ohgiraffers.childprotectproject.member.DTO;

import com.ohgiraffers.childprotectproject.member.common.UserRole;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface MemberDAO {

        // ----------------------------------------------------
        /* 로그인 기능에 사용 */
        MemberDTO findByMemberIdAndPassword(@Param("member_id") String member_id, @Param("member_pw") String member_pw);

        // ----------------------------------------------------
        /* 회원가입 */
        int saveMember(MemberDTO member);

        // ----------------------------------------------------
        /* 사용자리스트 관리 (관리자용) */
        // 보기
        List<MemberDTO> getAllMemberList();
        // 수정
        void updateMember(MemberDTO member);

        // 특정 id로 조회
        MemberDTO findByMemberId(String member_id);

        // 삭제
        void deleteMember(String member_id);

        // ----------------------------------------------------


}
