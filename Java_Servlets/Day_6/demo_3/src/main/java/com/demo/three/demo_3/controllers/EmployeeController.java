package com.demo.three.demo_3.controllers;

import com.demo.three.demo_3.utilities.Records;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
  @Autowired
  Records refRecords;

  @GetMapping("/employees")
  public ArrayList<String> allEmployees() {
    return refRecords.showEmployees();
  }

  @PostMapping("/employees/add/{employee}")
  public String addEmployee(@PathVariable("employee") String name) {
    refRecords.addEmployee(name);
    return "Employee added";
  }

  @DeleteMapping("/employees/remove/{employee}")
  public String removeEmployee(@PathVariable("employee") String name) {
    refRecords.removeEmployee(name);
    return "Employee removed";
  }
}