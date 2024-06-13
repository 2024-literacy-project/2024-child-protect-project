package com.ohgiraffers.childprotectproject.test.model.dto;

import java.util.List;

public class ApiResponse {
    private int totalCount;
    private List<LocationData> list;
    private String result;
    private String msg;

    // getters and setters

    public ApiResponse() {
    }

    public ApiResponse(int totalCount, List<LocationData> list, String result, String msg) {
        this.totalCount = totalCount;
        this.list = list;
        this.result = result;
        this.msg = msg;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<LocationData> getList() {
        return list;
    }

    public void setList(List<LocationData> list) {
        this.list = list;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
