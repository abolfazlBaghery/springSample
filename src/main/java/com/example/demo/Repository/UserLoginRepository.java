package com.example.demo.Repository;

import com.example.demo.Entity.userLogin;
import org.springframework.data.repository.CrudRepository;

public interface UserLoginRepository extends CrudRepository<userLogin,Long> {
}
