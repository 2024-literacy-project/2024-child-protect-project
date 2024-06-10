package com.ohgiraffers.childprotectproject.community.DTO;

import java.util.List;

public interface CmuDAO {

    /* 리스트 */
    List<CmuDTO> getAllCmuList();

    CmuDTO getCmuByNo(int board_no);    //상세, 삭제 에 사용

    /* 추가 */
    void insertCmu(CmuDTO cmu);

    /* 삭제 */
    void deleteCmu(int board_no);

    /* 수정 */
    void updateCmu(CmuDTO cmu);


    CmuDTO findById(int board_no);      //수정에 사용






}