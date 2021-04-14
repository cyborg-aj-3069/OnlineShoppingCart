package com.casestudy.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetails implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired


    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
