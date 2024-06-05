package com.ohgiraffers.childprotectproject.test.model.dao;

import com.ohgiraffers.childprotectproject.test.model.dto.TestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestDAO {
    List<TestDTO> getAllMemberList();
}

