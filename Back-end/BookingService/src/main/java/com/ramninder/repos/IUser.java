package com.ramninder.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramninder.models.Users;

@Repository
public interface IUser extends JpaRepository<Users, Integer> {
	
	public Users findUsersByUsernameAndPassword(String username, String password);

}
