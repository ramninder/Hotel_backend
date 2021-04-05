package com.ramninder.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramninder.models.Users;
import com.ramninder.repos.IUser;

@Service
public class AuthServiceImplementation implements AuthService  {
	
	private IUser ud;
	
	@Autowired
	 public AuthServiceImplementation(IUser ud ) {
		this.ud = ud;
	}

	public Users loginWithUsernameAndPassword(Users u) {
		return ud.findUsersByUsernameAndPassword(u.getUsername(), u.getPassword());
	}
}
