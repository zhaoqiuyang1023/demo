package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String aaaa(){

        return "1";
    }

    @RequestMapping("/test1")
    public String aaaa1(){

        return "2";
    }
}
