package com.ohgiraffers.childprotectproject.test.service;

import com.ohgiraffers.childprotectproject.test.model.dao.TestDAO;
import com.ohgiraffers.childprotectproject.test.model.dto.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    private final TestDAO testDAO;

    @Autowired
    public TestService(TestDAO testDAO) {
        this.testDAO = testDAO;
    }

    public List<TestDTO> getAllMemberList() {
        return testDAO.getAllMemberList();
    }

}
