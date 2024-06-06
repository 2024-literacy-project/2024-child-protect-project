package com.ohgiraffers.childprotectproject.member.DTO;

import com.ohgiraffers.childprotectproject.member.common.UserRole;

public class MemberDTO {
    private int member_no;
    private String member_id;
    private String member_pw;
    private String member_name;
    private String member_phone;
    private UserRole member_role;
    private String guardians_role;

    public MemberDTO() {
    }

    public MemberDTO(int member_no, String member_id, String member_pw, String member_name, String member_phone, UserRole member_role, String guardians_role) {
        this.member_no = member_no;
        this.member_id = member_id;
        this.member_pw = member_pw;
        this.member_name = member_name;
        this.member_phone = member_phone;
        this.member_role = member_role;
        this.guardians_role = guardians_role;
    }

    public int getMember_no() {
        return member_no;
    }

    public void setMember_no(int member_no) {
        this.member_no = member_no;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getMember_pw() {
        return member_pw;
    }

    public void setMember_pw(String member_pw) {
        this.member_pw = member_pw;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public String getMember_phone() {
        return member_phone;
    }

    public void setMember_phone(String member_phone) {
        this.member_phone = member_phone;
    }

    public UserRole getMember_role() {
        return member_role;
    }

    public void setMember_role(UserRole member_role) {
        this.member_role = member_role;
    }

    public String getGuardians_role() {
        return guardians_role;
    }

    public void setGuardians_role(String guardians_role) {
        this.guardians_role = guardians_role;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "member_no=" + member_no +
                ", member_id='" + member_id + '\'' +
                ", member_pw='" + member_pw + '\'' +
                ", member_name='" + member_name + '\'' +
                ", member_phone='" + member_phone + '\'' +
                ", member_role=" + member_role +
                ", guardians_role='" + guardians_role + '\'' +
                '}';
    }
}
