package com.charter.zipkinService1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@RestController
class ZipkinController {

    @Autowired
    RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    private static final Logger LOG = Logger.getLogger(ZipkinController.class.getName());

    @RequestMapping("/service1")
    public String greet() {

        LOG.info("Inside zipkinService 1..");

        String greetingMsg = "Hello";

        String userName = restTemplate.getForObject("http://localhost:8083/service2", String.class);
        String userAddress = restTemplate.getForObject("http://localhost:8084/service3", String.class);

        return greetingMsg + " " + userName + "!\n\n" + userAddress;
    }
}