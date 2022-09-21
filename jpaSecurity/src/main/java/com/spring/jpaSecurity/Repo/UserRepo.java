package com.spring.jpaSecurity.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpaSecurity.Entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	User findByUsername(String username);
}

