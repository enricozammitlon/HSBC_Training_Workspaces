package com.demo.three.demo_3.utilities;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.three.demo_3.entities.Student;

import org.springframework.stereotype.Service;

@Service
public class StudentRecords {
  ArrayList<Student> list = new ArrayList<Student>();

  public StudentRecords() {
    Student studentOne = new Student();
    studentOne.regno = 1;
    studentOne.marks = 150;
    studentOne.name = "Bob";
    list.add(studentOne);
  }

  public ArrayList<Student> getAllStudents() {
    return list;
  }

  public void addStudent(int regno, String name, int marks) {
    list.add(new Student(regno, name, marks));
  }

  public ArrayList<Student> findStudentsByName(String name) {
    ArrayList<Student> filteredList = new ArrayList<Student>();
    Iterator<Student> iterator = list.iterator();
    while (iterator.hasNext()) {
      Student student = iterator.next();
      if (student.name.equals(name)) {
        filteredList.add(student);
      }
    }
    return filteredList;
  }

  public ArrayList<Student> findStudentsByNameV2(String name) {
    List<Student> studentList = list.stream().filter(student -> name.equalsIgnoreCase(student.name))
        .collect(Collectors.toList());
    return new ArrayList<Student>(studentList);
  }
}
