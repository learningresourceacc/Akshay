package com.spring.jpaSecurity.Controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpaSecurity.Entities.User;
import com.spring.jpaSecurity.Services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/getAllUsers")
	public ResponseEntity<Object> getAllUsers(){
		List<User> users=userService.getAllUsers();
		return new ResponseEntity<Object>(users,HttpStatus.FOUND);
	}
	
	@GetMapping("/getUserByUsername/{username}")
	public ResponseEntity<Object> getUserByUsername(@PathVariable String username){
		User user=userService.getUserByUsername(username);
		if(user==null)
			throw new UsernameNotFoundException("Username not Found");
		return new ResponseEntity<Object>(user,HttpStatus.FOUND);
	}
	
	@PostMapping("/createUser")
	public ResponseEntity<Object> createUser(@RequestBody User user){
		String message=userService.saveUser(user);
		if(message==null)
			throw new RuntimeException("Error creating in User");
		return new ResponseEntity<Object>(message,HttpStatus.valueOf(201));
		
	}
	
}
