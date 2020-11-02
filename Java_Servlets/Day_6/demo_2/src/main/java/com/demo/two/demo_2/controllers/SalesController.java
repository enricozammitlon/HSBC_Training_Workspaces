package com.demo.two.demo_2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesController {
    @GetMapping("/hsbc/sales")
    public String aboutUs() {
        return "Sales Depatment of HSBC";
    }
}