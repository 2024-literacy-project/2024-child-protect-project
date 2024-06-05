package com.ohgiraffers.childprotectproject.community.Controller;

import com.ohgiraffers.childprotectproject.community.DTO.CmuDTO;
import com.ohgiraffers.childprotectproject.community.Service.CmuService;
import com.ohgiraffers.childprotectproject.community.Service.CmuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
    @RequestMapping("/community")
    public class CmuController {

        @Autowired
        private CmuService cmuService;
        @Autowired
        private CmuServiceImpl cmuServiceImpl;

        /* 리스트 */
        @GetMapping("/list")
        public String getAllCmuList(Model model) {
            model.addAttribute("cmuList", cmuServiceImpl.getAllCmuList());
            return "community/list";
        }

        /* 상세 보기 */
        @GetMapping("/detail/{board_no}")
        public String getCmuByNo(@PathVariable String board_no, Model model) {
            try {
                int no = Integer.parseInt(board_no);
                model.addAttribute("cmu", cmuServiceImpl.getCmuByNo(no));

                return "community/detail";
            } catch (NumberFormatException e) {
                // 숫자가 아닌 값이 입력된 경우의 처리 로직
                return "community/errorPage"; // 적절한 에러 페이지로 리다이렉트
            }
        }

        /* 추가 */
        @GetMapping("/add")
        public String showAddForm(Model model) {
            model.addAttribute("cmu", new CmuDTO());
            return "community/add"; // 새 글 작성 폼을 보여줄 HTML 파일명
        }
        @PostMapping("/add")
        public String insertCmu(@ModelAttribute CmuDTO cmu) {
            cmuServiceImpl.insertCmu(cmu);
            return "redirect:/community/list";
        }

        /* 삭제 */
        @GetMapping("/delete/{board_no}")
        public String deleteCmu(@PathVariable int board_no) {
            cmuServiceImpl.deleteCmu(board_no);
            return "redirect:/community/list";
        }


//    @GetMapping("/update/{id}")
//    public String updateCmu(@PathVariable("id") Long id, Model model) {
//        // 비즈니스 로직 수행
//        model.addAttribute("cmu", cmuService.findById(id));
//        return "updatePage"; // updatePage.html 또는 updatePage.jsp로 매핑
//    }

        /* 업데이트 페이지 이동 */
        @GetMapping("/update/{board_no}")
        public String showUpdateForm(@PathVariable int board_no, Model model) {
            Optional<CmuDTO> cmuDTO = cmuServiceImpl.findById(board_no);
            if (cmuDTO.isPresent()) {
                model.addAttribute("cmu", cmuDTO.get());
                return "community/update"; // 업데이트 폼을 보여줄 HTML 파일명
            } else {
                return "community/errorPage"; // 적절한 에러 페이지로 리다이렉트
            }
        }

        @PostMapping("/update")
        public String updateCmu(@ModelAttribute CmuDTO cmu) {
            cmuServiceImpl.updateCmu(cmu);
            return "redirect:/community/list";
        }





    }
