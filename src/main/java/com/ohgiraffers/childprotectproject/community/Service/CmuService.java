package com.ohgiraffers.childprotectproject.community.Service;


import com.ohgiraffers.childprotectproject.community.DTO.CmuDTO;

import java.util.List;
import java.util.Optional;

public interface CmuService {

    /* 리스트 */
    List<CmuDTO> getAllCmuList();

    CmuDTO getCmuByNo(int board_no);

    /* 추가 */
    void insertCmu(CmuDTO cmu);

    /* 삭제 */
    void deleteCmu(int board_no);

    /* 수정 */
    void updateCmu(CmuDTO cmu);

    /* 특정 ID로 조회 */
    Optional<CmuDTO> findById(int board_no);



}