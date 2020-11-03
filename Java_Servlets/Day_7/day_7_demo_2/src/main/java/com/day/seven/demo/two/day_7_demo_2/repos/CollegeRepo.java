package com.day.seven.demo.two.day_7_demo_2.repos;

import java.util.List;

import com.day.seven.demo.two.day_7_demo_2.entities.College;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepo extends JpaRepository<College, Integer> {
  public List<College> findByName(String name);

  public List<College> findByMarks(int marks);

}
