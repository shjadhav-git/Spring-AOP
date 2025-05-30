package com.springmvc.springaopdemo.repo;

import com.springmvc.springaopdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
