package com.milog.course.repositoriers;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milog.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
