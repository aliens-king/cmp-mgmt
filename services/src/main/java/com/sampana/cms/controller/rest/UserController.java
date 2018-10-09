package com.sampana.cms.controller.rest;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sampana.cms.dto.UserDTO;
import com.sampana.cms.model.ResponseDTO;
import com.sampana.cms.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	/*
	@GetMapping("/users")
	@PostMapping("/users")
	@GetMapping("/users/{id}")
	@DeleteMapping("/users/{id}")
	@PutMapping("/users/{id}")
	*/
	
	
	@GetMapping("/check")
public String hello() {
	return "helloWorld!!";
}
	@PostMapping("/users")
	public ResponseDTO createUser(@RequestBody UserDTO userDTO) {
		return userService.save(userDTO);
	}
	
	
	
	
}
