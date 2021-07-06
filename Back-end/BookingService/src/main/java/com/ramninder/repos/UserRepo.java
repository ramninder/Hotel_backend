package com.ramninder.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramninder.models.User;


public interface UserRepo extends JpaRepository<User, Long> {

	public User findByEmail(String email);

}
