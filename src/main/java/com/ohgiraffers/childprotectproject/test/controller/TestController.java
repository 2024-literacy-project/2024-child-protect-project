package com.ohgiraffers.childprotectproject.test.controller;

import com.ohgiraffers.childprotectproject.test.service.TestService;
import com.ohgiraffers.childprotectproject.test.model.dto.TestDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping("/test")
    public ModelAndView openAll() throws Exception {

        ModelAndView mv = new ModelAndView("test/test");
        List<TestDTO> listMember = testService.getAllMemberList();

        mv.addObject("listMember", listMember);

        return mv;
    }
}