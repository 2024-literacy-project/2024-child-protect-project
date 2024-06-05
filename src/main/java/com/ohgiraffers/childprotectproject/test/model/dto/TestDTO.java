package com.ohgiraffers.childprotectproject.test.model.dto;

public class TestDTO {

    private int member_no;
    private String member_id;
    private String member_pw;
    private String member_name;
    private String member_phone;
    private int member_role;

    public TestDTO() {
    }

    public TestDTO(int member_no, String member_id, String member_pw, String member_name, String member_phone, int member_role) {
        this.member_no = member_no;
        this.member_id = member_id;
        this.member_pw = member_pw;
        this.member_name = member_name;
        this.member_phone = member_phone;
        this.member_role = member_role;
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

    public int getMember_role() {
        return member_role;
    }

    public void setMember_role(int member_role) {
        this.member_role = member_role;
    }

    @Override
    public String toString() {
        return "TestDTO{" +
                "member_no=" + member_no +
                ", member_id='" + member_id + '\'' +
                ", member_pw='" + member_pw + '\'' +
                ", member_name='" + member_name + '\'' +
                ", member_phone='" + member_phone + '\'' +
                ", member_role=" + member_role +
                '}';
    }
}