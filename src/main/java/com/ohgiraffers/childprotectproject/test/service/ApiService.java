package com.ohgiraffers.childprotectproject.test.service;

//import com.ohgiraffers.childprotectproject.test.model.dto.LocationData;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import java.util.Arrays;
//import java.util.List;
//
//
////https://www.safe182.go.kr/api/lcm/safeMap.do?esntlId=10000644&authKey=4caec6db94614ee8&pageIndex=1&pageUnit=10&clArray=09&xmlUseYN=Y
//@Service
//public class ApiService {
//    public List<LocationData> fetchPublicData(double lat, double lon) {
//        // 위도와 경도를 기반으로 최대/최소 값을 계산
//        double distance = 1.0; // 예시 거리 (1도)
//        double minLat = lat - distance;
//        double maxLat = lat + distance;
//        double minLon = lon - distance;
//        double maxLon = lon + distance;
//
//        String url = String.format("https://www.safe182.go.kr/api/lcm/safeMap.do?esntlId=10000644&authKey=4caec6db94614ee8&pageIndex=1&pageUnit=10&minY=%f&minX=%f&maxY=%f&maxX=%f&clArray=09", minLat, minLon, maxLat, maxLon);
//
////        String url = "https://www.safe182.go.kr/api/lcm/safeMap.do?esntlId=10000644&authKey=4caec6db94614ee8&pageIndex=1&pageUnit=10&minY=" + minLat + "&minX=" + maxLat + "&maxY=" + minLon + "&maxX=" + maxLon + "&clArray=09";
//        RestTemplate restTemplate = new RestTemplate();
//        LocationData[] data = restTemplate.getForObject(url, LocationData[].class);
//
//        return Arrays.asList(data);
//    }
//}

import com.ohgiraffers.childprotectproject.test.model.dto.ApiResponse;
import com.ohgiraffers.childprotectproject.test.model.dto.LocationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


//https://www.safe182.go.kr/api/lcm/safeMap.do?esntlId=10000644&authKey=4caec6db94614ee8&pageIndex=1&pageUnit=10&clArray=09&xmlUseYN=Y
@Service
public class ApiService {

    @Autowired
    private RestTemplate restTemplate;


    public List<LocationData> fetchPublicData(double minLat, double minLon, double maxLat, double maxLon) {
        String url = "https://www.safe182.go.kr/api/lcm/safeMap.do?esntlId=10000644&authKey=4caec6db94614ee8&pageIndex=1&pageUnit=100&" +
                "minY=" + minLat +
                "&minX=" + minLon +
                "&maxY=" + maxLat +
                "&maxX=" + maxLon +
                "&clArray=09";

        System.out.println(url);

        ApiResponse response = restTemplate.getForObject(url, ApiResponse.class);
        return response != null ? response.getList() : null;
    }
}
