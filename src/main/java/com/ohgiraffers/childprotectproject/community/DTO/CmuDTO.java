package com.ohgiraffers.childprotectproject.community.DTO;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class CmuDTO {

    private int board_no;

    private String board_title;

    private String board_contents;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate board_date;

    private String member_id;

    private  String region;
    public CmuDTO() {
    }

    public CmuDTO(int board_no, String board_title, String board_contents, LocalDate board_date, String member_id, String region) {
        this.board_no = board_no;
        this.board_title = board_title;
        this.board_contents = board_contents;
        this.board_date = board_date;
        this.member_id = member_id;
        this.region = region;
    }

    public int getBoard_no() {
        return board_no;
    }

    public void setBoard_no(int board_no) {
        this.board_no = board_no;
    }

    public String getBoard_title() {
        return board_title;
    }

    public void setBoard_title(String board_title) {
        this.board_title = board_title;
    }

    public String getBoard_contents() {
        return board_contents;
    }

    public void setBoard_contents(String board_contents) {
        this.board_contents = board_contents;
    }

    public LocalDate getBoard_date() {
        return board_date;
    }

    public void setBoard_date(LocalDate board_date) {
        this.board_date = board_date;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "CmuDTO{" +
                "board_no=" + board_no +
                ", board_title='" + board_title + '\'' +
                ", board_contents='" + board_contents + '\'' +
                ", board_date=" + board_date +
                ", member_id='" + member_id + '\'' +
                ", region='" + region + '\'' +
                '}';
    }

}
