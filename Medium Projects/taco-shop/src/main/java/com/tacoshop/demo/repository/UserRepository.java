package com.tacoshop.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tacoshop.demo.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
}
