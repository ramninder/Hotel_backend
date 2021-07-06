//package com.ramninder.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//
//@Controller
//public class UserController {
//
//	@Autowired
//	private com.ramninder.springsecurity.SecurityService securityService;
//
//	@Autowired
//	private com.ramninder.repos.UserRepo userRepo;
//
////	@Autowired
////	private PasswordEncoder encoder;
//
//	@PostMapping("/login")
//	public String login(String email, String password) {
//		boolean loginResponse = securityService.login(email, password);
//		if (loginResponse) {
//			return "You have successfully loggedin";
//		}
//		else {
//			return "invalid credentials";
//		}
//
//	}
//
//	
//
////	@PostMapping("/registerUser")
////	public String register(User user) {
////
////		user.setPassword(encoder.encode(user.getPassword()));
////		userRepo.save(user);
////		return "login";
////	}
//
//}
