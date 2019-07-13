package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/a")
    public String aaaa(){

        return "1123123";
    }

    @RequestMapping("/b")
    public String aaaa1(){

        return "2";
    }
}
