package com.ohgiraffers.childprotectproject.community.Controller;

import com.ohgiraffers.childprotectproject.community.DTO.CmuDTO;
import com.ohgiraffers.childprotectproject.community.Service.CmuService;
import com.ohgiraffers.childprotectproject.community.Service.CmuServiceImpl;
import com.ohgiraffers.childprotectproject.member.DTO.MemberDTO;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/community")
public class CmuController {

    @Autowired
    private CmuService cmuService;
    @Autowired
    private CmuServiceImpl cmuServiceImpl;

    /* 리스트 */
//        @GetMapping("/list")
//        public String getAllCmuList(Model model) {
//            model.addAttribute("cmuList", cmuServiceImpl.getAllCmuList());
//            return "community/list";
//        }
    @GetMapping("/list")
    public String getAllCmuList(HttpSession session, Model model) {
        model.addAttribute("cmuList", cmuServiceImpl.getAllCmuList());

        MemberDTO loggedInUser = (MemberDTO) session.getAttribute("loggedInUser");
        if (loggedInUser != null) {
            model.addAttribute("member_id", loggedInUser.getMember_id());
        }

        return "community/list";
    }

    /* 상세 보기 */
//        @GetMapping("/detail/{board_no}")
//        public String getCmuByNo(@PathVariable String board_no, Model model) {
//            try {
//                int no = Integer.parseInt(board_no);
//                model.addAttribute("cmu", cmuServiceImpl.getCmuByNo(no));
//
//                return "community/detail";
//            } catch (NumberFormatException e) {
//                // 숫자가 아닌 값이 입력된 경우의 처리 로직
//                return "community/errorPage"; // 적절한 에러 페이지로 리다이렉트
//            }
//        }
    @GetMapping("/detail/{board_no}")
    public String getCmuByNo(@PathVariable String board_no, HttpSession session, Model model) {
        try {
            int no = Integer.parseInt(board_no);
            model.addAttribute("cmu", cmuServiceImpl.getCmuByNo(no));

            MemberDTO loggedInUser = (MemberDTO) session.getAttribute("loggedInUser");
            if (loggedInUser != null) {
                model.addAttribute("member_id", loggedInUser.getMember_id());
            }

            return "community/detail";
        } catch (NumberFormatException e) {
            return "community/errorPage";
        }
    }


    /* 추가 */
//        @GetMapping("/add")
//        public String showAddForm(Model model) {
//            model.addAttribute("cmu", new CmuDTO());
//            return "community/add"; // 새 글 작성 폼을 보여줄 HTML 파일명
//        }
    @GetMapping("/add")
    public String showAddForm(HttpSession session, Model model) {
        model.addAttribute("cmu", new CmuDTO());

        MemberDTO loggedInUser = (MemberDTO) session.getAttribute("loggedInUser");
        if (loggedInUser != null) {
            model.addAttribute("member_id", loggedInUser.getMember_id());
        } else {
            return "redirect:/member/login";        //로그인 안되면 글작성 못하고 로그인 페이지로 이동.
        }

        return "community/add";
    }

//    @PostMapping("/add")
//    public String insertCmu(@ModelAttribute CmuDTO cmu) {
//        cmuServiceImpl.insertCmu(cmu);
//        return "redirect:/community/list";
//    }

    @PostMapping("/add")
    public String insertCmu(@ModelAttribute CmuDTO cmu, HttpSession session) {
        MemberDTO loggedInUser = (MemberDTO) session.getAttribute("loggedInUser");
        if (loggedInUser != null) {
            cmu.setMember_id(loggedInUser.getMember_id());
        } else {
            return "redirect:/member/login";        //로그인 안되면 글작성 못하고 로그인 페이지로 이동.
        }
        cmuServiceImpl.insertCmu(cmu);
        return "redirect:/community/list";
    }

//        @PostMapping("/add")
//        public String insertCmu(@ModelAttribute CmuDTO cmu,  HttpSession session) {
//            CmuDTO loggedInUser = (CmuDTO) session.getAttribute("loggedInUser");
//            if(loggedInUser != null){
//                cmu.setMember_id(loggedInUser.getMember_id());
//            }
//            cmuServiceImpl.insertCmu(cmu);
//            return "redirect:/community/list";
//        }

    /* 삭제 */
//    @GetMapping("/delete/{board_no}")
//    public String deleteCmu(@PathVariable int board_no, @ModelAttribute CmuDTO cmu, HttpSession session) {
//
//        MemberDTO loggedInUser = (MemberDTO) session.getAttribute("loggedInUser");
//        if (loggedInUser != null) {
//            cmu.setMember_id(loggedInUser.getMember_id());
//        } else {
//            return "redirect:/member/login";        //로그인 안되면 글작성 못하고 로그인 페이지로 이동.
//        }
//
//        cmuServiceImpl.deleteCmu(board_no);
//        return "redirect:/community/list";
//    }
    @GetMapping("/delete/{board_no}")
    public String deleteCmu(@PathVariable int board_no, HttpSession session, RedirectAttributes redirectAttributes) {
        MemberDTO loggedInUser = (MemberDTO) session.getAttribute("loggedInUser");

        if (loggedInUser == null) {
            return "redirect:/member/login"; // 로그인 안되면 로그인 페이지로 이동
        }

        // 게시물 가져오기
        CmuDTO cmu = cmuServiceImpl.getCmuByNo(board_no);

        // 현재 로그인한 사용자가 게시물 작성자인지 확인
        if (!loggedInUser.getMember_id().equals(cmu.getMember_id())  && !loggedInUser.getMember_id().equals("admin")) {
            redirectAttributes.addFlashAttribute("errorMessage", "삭제 권한이 없습니다.");
            return "redirect:/community/detail/" + board_no; // 작성자가 아니면 상세 페이지로 리디렉션
        }

        // 게시물 삭제
        cmuServiceImpl.deleteCmu(board_no);
        return "redirect:/community/list"; // 삭제 후 목록 페이지로 리디렉션
    }


//    @GetMapping("/update/{id}")
//    public String updateCmu(@PathVariable("id") Long id, Model model) {
//        // 비즈니스 로직 수행
//        model.addAttribute("cmu", cmuService.findById(id));
//        return "updatePage"; // updatePage.html 또는 updatePage.jsp로 매핑
//    }

    /* 업데이트 페이지 이동 */
//        @GetMapping("/update/{board_no}")
//        public String showUpdateForm(@PathVariable int board_no, Model model) {
//            Optional<CmuDTO> cmuDTO = cmuServiceImpl.findById(board_no);
//            if (cmuDTO.isPresent()) {
//                model.addAttribute("cmu", cmuDTO.get());
//                return "community/update"; // 업데이트 폼을 보여줄 HTML 파일명
//            } else {
//                return "community/errorPage"; // 적절한 에러 페이지로 리다이렉트
//            }
//        }
//    @GetMapping("/update/{board_no}")
//    public String showUpdateForm(@PathVariable int board_no, HttpSession session, Model model) {
//        Optional<CmuDTO> cmuDTO = cmuServiceImpl.findById(board_no);
//        if (cmuDTO.isPresent()) {
//            model.addAttribute("cmu", cmuDTO.get());
//
//            MemberDTO loggedInUser = (MemberDTO) session.getAttribute("loggedInUser");
//            if (loggedInUser != null) {
//                model.addAttribute("member_id", loggedInUser.getMember_id());
//            } else {
//                return "redirect:/member/login";        //로그인 안되면 글작성 못하고 로그인 페이지로 이동.
//            }
//
//            return "community/update";
//        } else {
//            return "community/errorPage";
//        }
//    }
    @GetMapping("/update/{board_no}")
    public String showUpdateForm(@PathVariable int board_no, HttpSession session, Model model, RedirectAttributes redirectAttributes) {
        Optional<CmuDTO> cmuDTO = cmuServiceImpl.findById(board_no);

        if (cmuDTO.isPresent()) {
            CmuDTO cmu = cmuDTO.get();
            model.addAttribute("cmu", cmu);

            // 현재 로그인한 사용자 정보 가져오기
            MemberDTO loggedInUser = (MemberDTO) session.getAttribute("loggedInUser");

            if (loggedInUser == null) {
                // 로그인하지 않은 사용자는 로그인 페이지로 이동
                return "redirect:/member/login";
            }

            if (!loggedInUser.getMember_id().equals(cmu.getMember_id()) && !loggedInUser.getMember_id().equals("admin") ){
                redirectAttributes.addFlashAttribute("errorMessage", "수정 권한이 없습니다.");
//                return "redirect:/community/update/"; // 작성자가 아니면 수정 페이지로 리디렉션
                return "redirect:/community/detail/" + board_no; // 작성자가 아니면 상세 페이지로 리디렉션
            }

            return "community/update";

            // 로그인 여부 확인
/*            if (loggedInUser != null) {
                // 현재 로그인한 사용자가 관리자인지 확인
                if ("admin".equals(loggedInUser.getMember_id())) {
                    // 관리자인 경우 모든 글 수정 가능
                    return "community/update";
                } else {
                    // 관리자가 아닌 경우에는 작성자와 로그인한 사용자가 일치하는지 확인하여 권한 부여
                    if (loggedInUser.getMember_id().equals(cmu.getMember_id())) {
                        return "community/update";
                    } else {
                        // 작성자와 로그인한 사용자가 다른 경우 에러 페이지로 리다이렉트
                        return "redirect:/community/errorPage";
                    }
                }
            } *//*else {
                // 로그인하지 않은 사용자는 로그인 페이지로 이동
                return "redirect:/member/login";
            }
            */
        } else {
//            return "community/errorPage";
            // 게시물이 존재하지 않는 경우
            redirectAttributes.addFlashAttribute("errorMessage", "게시물이 존재하지 않습니다.");
            return "redirect:/community/list"; // 목록 페이지로 리디렉션
        }
    }

//    @PostMapping("/update")
//    public String updateCmu(@ModelAttribute CmuDTO cmu) {
//        cmuServiceImpl.updateCmu(cmu);
//        return "redirect:/community/list";
//    }
//        @PostMapping("/update")
//        public String updateCmu(@ModelAttribute CmuDTO cmu, HttpSession session) {
//            MemberDTO loggedInUser = (MemberDTO) session.getAttribute("loggedInUser");
//            if (loggedInUser != null) {
//                cmu.setMember_id(loggedInUser.getMember_id());
//            } else {
//                return "redirect:/member/login";        //로그인 안되면 글작성 못하고 로그인 페이지로 이동.
//            }
//
//            cmuServiceImpl.updateCmu(cmu);
//            return "redirect:/community/list";
//        }
        @PostMapping("/update")
        public String updateCmu(@ModelAttribute CmuDTO cmu, HttpSession session, RedirectAttributes redirectAttributes) {
            // 현재 로그인한 사용자 정보 가져오기
            MemberDTO loggedInUser = (MemberDTO) session.getAttribute("loggedInUser");

            if (loggedInUser == null) {
                // 로그인하지 않은 사용자는 로그인 페이지로 이동
                return "redirect:/member/login";
            }

            if (!loggedInUser.getMember_id().equals(cmu.getMember_id()) && !loggedInUser.getMember_id().equals("admin")) {
                redirectAttributes.addFlashAttribute("errorMessage", "수정 권한이 없습니다.");
                return "redirect:/community/list/"; // 작성자가 아니면 리스트 페이지로 리디렉션
            }

            cmuServiceImpl.updateCmu(cmu);
            return "redirect:/community/list";

            // 로그인 여부 확인
//            if (loggedInUser != null) {
//                // 현재 로그인한 사용자가 관리자인지 확인
//                if ("admin".equals(loggedInUser.getMember_id())) {
//                    // 관리자인 경우 모든 글 수정 가능
//                    cmuServiceImpl.updateCmu(cmu);
//                    return "redirect:/community/list";
//                } else {
//                    // 작성자와 로그인한 사용자가 일치하는지 확인하여 권한 부여
//                    if (loggedInUser.getMember_id().equals(cmu.getMember_id())) {
//                        cmuServiceImpl.updateCmu(cmu);
//                        return "redirect:/community/list";
//                    } else {
//                        // 작성자와 로그인한 사용자가 다른 경우 에러 페이지로 리다이렉트
//                        return "redirect:/community/errorPage";
//                    }
//                }
//            } else {
//                // 로그인하지 않은 사용자는 로그인 페이지로 이동
//                return "redirect:/member/login";
//            }
            }

//        @PostMapping("/update")
//        public String updateCmu(@ModelAttribute CmuDTO cmu, HttpSession session) {
//            MemberDTO loggedInUser = (MemberDTO) session.getAttribute("loggedInUser");
//            if (loggedInUser != null) {
//                cmu.setMember_id(loggedInUser.getMember_id());
//            }
//            cmuServiceImpl.updateCmu(cmu);
//            return "redirect:/community/list";
//        }


        }
