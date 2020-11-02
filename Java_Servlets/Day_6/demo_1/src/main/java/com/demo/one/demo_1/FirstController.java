package com.demo.one.demo_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/hello")
    public String testOne(){
         return "Get Request Received";
    }
    @PostMapping("/hello")
    public String testTwo(){
        return "Post Request Received";
    }
}