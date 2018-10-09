package com.sampana.cms.controller.rest;




import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class User {

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
}
