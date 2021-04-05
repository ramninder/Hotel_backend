package com.ramninder.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramninder.models.Users;
import com.ramninder.services.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	private AuthService as;
	
	public AuthController(AuthService as) {
		this.as = as;
	}
	
	@PostMapping
	public ResponseEntity<Users> saveNewUser(@RequestBody Users u){
		//Here we call database to get data 
		return new ResponseEntity<Users>(as.loginWithUsernameAndPassword(u), HttpStatus.CREATED);
		
	}

}