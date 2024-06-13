package com.ohgiraffers.childprotectproject.map;

import com.ohgiraffers.childprotectproject.test.model.dto.LocationData;
import com.ohgiraffers.childprotectproject.test.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {

    @GetMapping("/a")
    public String showForm() {
        return "dataViewForm";
    }

    @Autowired
    private ApiService apiService;

    @GetMapping("/fetchData")
    public List<LocationData> fetchData(@RequestParam("minLat") double minLat,
                            @RequestParam("minLon") double minLon,
                            @RequestParam("maxLat") double maxLat,
                            @RequestParam("maxLon") double maxLon,
                            Model model) {
        //List<LocationData> locationDataList =
        //model.addAttribute("locationDataList", locationDataList);
        //return "test/test"; // Thymeleaf template name

        return apiService.fetchPublicData(minLat, minLon, maxLat, maxLon);
    }
}
