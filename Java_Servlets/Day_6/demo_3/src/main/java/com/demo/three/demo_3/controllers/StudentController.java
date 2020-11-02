package com.demo.three.demo_3.controllers;

import com.demo.three.demo_3.entities.Student;
import com.demo.three.demo_3.utilities.StudentRecords;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
  @Autowired
  StudentRecords refRecords;

  @GetMapping("/students")
  public ArrayList<Student> allStudents() {
    return refRecords.getAllStudents();
  }

  @PostMapping("/students/add/{regno}/{name}/{marks}")
  public String addStudent(@PathVariable("regno") int regno, @PathVariable("name") String name,
      @PathVariable("marks") int marks) {
    refRecords.addStudent(regno, name, marks);
    return "Student added";
  }

  @GetMapping("/students/{name}")
  public ArrayList<Student> studentsByNameSearch(@PathVariable("name") String name) {
    return refRecords.findStudentsByNameV2(name);
  }

}