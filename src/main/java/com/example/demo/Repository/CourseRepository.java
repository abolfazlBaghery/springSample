package com.example.demo.Repository;

import com.example.demo.Entity.course;
import com.example.demo.Entity.master;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<course,Long> {
}
