package com.ramninder.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



@Service
public class UserdetailServiceImpl implements UserDetailsService {

	@Autowired
	private com.ramninder.repos.UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		com.ramninder.models.User user = userRepo.findByEmail(username);
		if(user == null) {
			throw new UsernameNotFoundException("User not found for email"+username);
		}
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
				user.getRoles());
	}

}

