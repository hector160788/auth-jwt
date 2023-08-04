package com.auth.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.app.entity.AuthUser;

public interface AuthUserRepository extends JpaRepository<AuthUser	, Integer>{
	
	Optional<AuthUser> findByUserName(String username);

}
