package com.blog.blog.repositories;

import com.blog.blog.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Long> {

    List<User> findAll();
//    List<User> findById();

    User findByUsername(String username);

}
