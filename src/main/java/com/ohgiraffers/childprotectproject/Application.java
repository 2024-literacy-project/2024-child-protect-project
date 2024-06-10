package com.ohgiraffers.childprotectproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
//
//    @Bean
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }

//    @Bean
//    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//        return args -> {
//            // API URL
//            String url = "https://www.safe182.go.kr/api/lcm/safeMap.do?esntlId=10000645&authKey=f6ab857fde8045ef&pageIndex=50&pageUnit=100&detailDate1=09";
//
//            // API 호출
//            String response = restTemplate.getForObject(url, String.class);
//
//            ObjectMapper objectMapper = new ObjectMapper();
//            ApiTestResponse apiTestResponse = objectMapper.readValue(response, ApiTestResponse.class);
//
//            apiTestResponse.getList().forEach(item -> {
//                System.out.println("가게명: " + item.getBsshNm());
//                System.out.println("전화번호: " + item.getTelno());
//                System.out.println("주소: " + item.getAdres());
//            });
//        };
//    }
}