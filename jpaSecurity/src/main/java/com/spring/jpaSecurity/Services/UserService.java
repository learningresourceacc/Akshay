package com.spring.jpaSecurity.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.spring.jpaSecurity.Entities.User;
import com.spring.jpaSecurity.Repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo dao;
	
	public List<User> getAllUsers() {
		return dao.findAll();
	}
	

	public User getUserByUsername(String username) {
		return dao.findByUsername(username);
	}
	
	public String saveUser(User user) {
		String encrptedPassword=BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(10));
		user.setPassword(encrptedPassword);
		dao.save(user);
		return "User "+user.getUsername() +" is created Successfully";
	}
	
	
}
