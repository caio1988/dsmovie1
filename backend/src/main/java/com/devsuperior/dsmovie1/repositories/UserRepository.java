package com.devsuperior.dsmovie1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie1.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
	
}
