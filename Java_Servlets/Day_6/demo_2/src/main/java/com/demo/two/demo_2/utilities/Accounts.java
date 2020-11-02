package com.demo.two.demo_2.utilities;

import org.springframework.stereotype.Service;

@Service
public class Accounts {
    public double tax(double salary) {
        double taxPercent = 0;
        if (salary >= 1000) {
            if (salary < 2000) {
                taxPercent = 0.15;
            } else {
                taxPercent = 0.25;
            }
        }
        return (salary * taxPercent);
    }
}
