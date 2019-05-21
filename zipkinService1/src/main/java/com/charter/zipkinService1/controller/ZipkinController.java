package com.charter.zipkinService1.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin
class ZipkinController {

    @RequestMapping("/service1")
    public String greet() {

        String greetingMsg = "Hello";

        String userName = restTemplate().getForObject("http://localhost:8083/service2", String.class);
        String userAddress = restTemplate().getForObject("http://localhost:8084/service3", String.class);

        return greetingMsg + " " + userName + "!\n\n" + userAddress;
    }
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}