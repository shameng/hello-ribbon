package com.meng.helloribbon.controller;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author meng
 * @create 2017-12-15 13:20
 **/
@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String helloConsumer() {
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
    }
}
