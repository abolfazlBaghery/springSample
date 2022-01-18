package com.example.demo.Repository;

import com.example.demo.Entity.student;
import com.example.demo.Entity.userLogin;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<student,Long> {
}
