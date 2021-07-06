package com.ramninder.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramninder.models.Role;


public interface RoleRepo extends JpaRepository<Role, Long> {

}
