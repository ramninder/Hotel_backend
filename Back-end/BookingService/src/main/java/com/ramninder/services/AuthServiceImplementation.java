package com.ramninder.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ramninder.models.Users;
import com.ramninder.repos.IUser;

@Service
public class AuthServiceImplementation implements AuthService  {
	
	private IUser ud;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    
	
	@Autowired
	 public AuthServiceImplementation(IUser ud, BCryptPasswordEncoder bCryptPasswordEncoder ) {
		this.ud = ud;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	public Users loginWithUsernameAndPassword(Users u) {
		return ud.findUsersByUsernameAndPassword(u.getUsername(), u.getPassword());
	}

	@Override
	public Users createNewUser(Users u) {
		
		//Users userDto= new Users();
			
		//Generate secure password.
        u.setPassword(bCryptPasswordEncoder.encode(u.getPassword()));
       

		
		return ud.saveAndFlush(u);
	}
}
