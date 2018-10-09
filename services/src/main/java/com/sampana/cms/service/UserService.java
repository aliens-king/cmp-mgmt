package com.sampana.cms.service;


import org.springframework.stereotype.Service;

import com.sampana.cms.dto.UserDTO;
import com.sampana.cms.model.ResponseDTO;
import com.sampana.cms.model.User;
import com.sampana.cms.repository.RoleRepository;
import com.sampana.cms.repository.UserRepository;



//@Service("userService")
public interface UserService {

    /*private UserRepository userRepository;
    private RoleRepository roleRepository;

    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
*/
	public ResponseDTO save(UserDTO userDTO);



}