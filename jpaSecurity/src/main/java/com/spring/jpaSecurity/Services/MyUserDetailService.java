package com.spring.jpaSecurity.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.jpaSecurity.Entities.User;
import com.spring.jpaSecurity.Repo.UserRepo;



@Service
public class MyUserDetailService implements UserDetailsService {

	@Autowired
	private UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=repo.findByUsername(username);
		if(user==null)
			throw new UsernameNotFoundException("USer Not Found in Database");
		
		return new UserPrincipal(user);
	}

}
