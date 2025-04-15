package com.springmvc.springaopdemo.service;

import com.springmvc.springaopdemo.model.User;
import com.springmvc.springaopdemo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import com.springmvc.springaopdemo.model.UserPrincipal;


@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    public UserDetails loadUserByUsername(String username){
        User user = repo.findByUsername(username);
        if(user == null){
            System.out.println("User not found! 404");
        }
        return new UserPrincipal(user);
    }
}
