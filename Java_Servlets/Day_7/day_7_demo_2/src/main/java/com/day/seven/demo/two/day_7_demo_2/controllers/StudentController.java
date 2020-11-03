package com.day.seven.demo.two.day_7_demo_2.controllers;

import java.util.List;
import java.util.Optional;

import com.day.seven.demo.two.day_7_demo_2.entities.College;
import com.day.seven.demo.two.day_7_demo_2.repos.CollegeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
  @Autowired
  CollegeRepo repoRef;

  @GetMapping("/showbyname/{name}")
  public List<College> showRecord(@PathVariable("name") String name) {
    return repoRef.findByName(name);
  }

  @PostMapping("/RecordEntry")
  public String insertRecord(@RequestBody College ref) {
    College student = repoRef.findById(ref.getRegno()).orElse(null);
    if (student != null) {
      return "Regno already taken";
    }
    repoRef.save(ref);

    return "Record saved";
  }

  @GetMapping("/showrecord/{regno}")
  public College showRecord(@PathVariable("regno") int R) {
    Optional<College> student = repoRef.findById(R);
    return student.orElse(null);
  }

  @PostMapping("/save")
  public String saveHardCodedRecord() {
    College student = new College();
    student.setMarks(100);
    student.setName("Enrico");
    student.setRegno(1);
    repoRef.save(student);
    return "Student save";
  }

  @PostMapping("/save/{regno}/{name}/{marks}")
  public String saveRecord() {
    College student = new College();
    student.setMarks(100);
    student.setName("Enrico");
    student.setRegno(1);
    repoRef.save(student);
    return "Student save";
  }

}
