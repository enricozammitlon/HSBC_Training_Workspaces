package com.day.seven.demo.two.day_7_demo_2.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
  @Id
  private int regno;
  private int marks;
  private String name;

  public int getRegno() {
    return this.regno;
  }

  public void setRegno(int regno) {
    this.regno = regno;
  }

  public int getMarks() {
    return this.marks;
  }

  public void setMarks(int marks) {
    this.marks = marks;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
