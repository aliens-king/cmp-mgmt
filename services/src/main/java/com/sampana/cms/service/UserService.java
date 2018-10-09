package com.sampana.cms.service;


import org.springframework.stereotype.Service;


import com.sampana.cms.model.User;
import com.sampana.cms.repository.RoleRepository;
import com.sampana.cms.repository.UserRepository;



@Service("userService")
public class UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;

    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }



}