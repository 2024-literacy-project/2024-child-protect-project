package com.ohgiraffers.childprotectproject.community.Service;

import com.ohgiraffers.childprotectproject.community.DTO.CmuDAO;
import com.ohgiraffers.childprotectproject.community.DTO.CmuDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CmuServiceImpl implements CmuService {

    @Autowired
    private CmuDAO cmuDAO;

    /* 리스트 */
    @Override
    public List<CmuDTO> getAllCmuList() {
        return cmuDAO.getAllCmuList();
    }

    @Override
    public CmuDTO getCmuByNo(int board_no) {
        return cmuDAO.getCmuByNo(board_no);
    }

    /* 추가 */
    @Override
    public void insertCmu(CmuDTO cmu) {
        cmuDAO.insertCmu(cmu);
    }

    /* 삭제 */
    @Override
    public void deleteCmu(int board_no) {
        cmuDAO.deleteCmu(board_no);
    }

    /* 수정 */
    @Override
    public void updateCmu(CmuDTO cmu) {
        cmuDAO.updateCmu(cmu);
    }

    /* 특정 ID로 조회 */
    @Override
    public Optional<CmuDTO> findById(int board_no) {
//        CmuDTO cmuDTO = cmuDAO.getCmuByNo(question_no);
        CmuDTO cmuDTO = cmuDAO.findById(board_no);
        return Optional.ofNullable(cmuDTO);
    }
}
