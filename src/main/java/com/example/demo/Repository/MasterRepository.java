package com.example.demo.Repository;

import com.example.demo.Entity.master;
import com.example.demo.Entity.student;
import org.springframework.data.repository.CrudRepository;

public interface MasterRepository extends CrudRepository<master,Long> {
}
