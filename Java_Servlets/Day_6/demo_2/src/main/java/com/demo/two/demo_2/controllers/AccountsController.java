package com.demo.two.demo_2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.demo.two.demo_2.utilities.*;

@RestController
public class AccountsController {
    @GetMapping("/hsbc/accounts")
    public String aboutUs() {
        return "Accounts Depatment of HSBC";
    }

    @Autowired
    Accounts ref;

    @GetMapping("/hsbc/accounts/{salary}")
    public String tax(@PathVariable("salary") int sal) {
        return "Your tax paid is: " + ref.tax(sal);
    }
}
