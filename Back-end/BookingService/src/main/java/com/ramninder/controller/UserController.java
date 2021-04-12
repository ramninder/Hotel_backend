package com.ramninder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramninder.models.Users;
import com.ramninder.services.AuthService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	private AuthService authServ;
	
	@Autowired
	public UserController(AuthService authServ) {
		this.authServ=authServ;
	}
	
	@PostMapping
	public ResponseEntity<Users> saveNewUser(@RequestBody Users u){
		//Here we call database to get data 
		return new ResponseEntity<Users>(authServ.createNewUser(u), HttpStatus.CREATED);
		
	}
	

}
