package com.ohgiraffers.childprotectproject.test.controller;

import com.ohgiraffers.childprotectproject.test.model.dto.LocationData;
import com.ohgiraffers.childprotectproject.test.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DataController {

    @GetMapping("/a")
    public String showForm() {
        return "dataViewForm";
    }

    @Autowired
    private ApiService apiService;

    @GetMapping("/fetchData")
    public String fetchData(@RequestParam("minLat") double minLat,
                            @RequestParam("minLon") double minLon,
                            @RequestParam("maxLat") double maxLat,
                            @RequestParam("maxLon") double maxLon,
                            Model model) {
        List<LocationData> locationDataList = apiService.fetchPublicData(minLat, minLon, maxLat, maxLon);
        model.addAttribute("locationDataList", locationDataList);
        return "test/test"; // Thymeleaf template name
    }
}
