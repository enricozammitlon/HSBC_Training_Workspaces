package com.demo.three.demo_3.utilities;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class Records {
  ArrayList<String> employees = new ArrayList<String>();

  public Records() {
    employees.add("Alice");
    employees.add("Bob");
  }

  public ArrayList<String> showEmployees() {
    return employees;
  }

  public void addEmployee(String employee) {
    employees.add(employee);
  }

  public void removeEmployee(String employee) {
    employees.remove(employee);
  }
}
