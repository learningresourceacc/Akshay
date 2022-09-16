package com.example.demoJPA.Security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class CustomSecurity extends WebSecurityConfigurerAdapter {
	
	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		// TODO Auto-generated method stub
		List<UserDetails> users=new ArrayList<>();
		users.add(User.withDefaultPasswordEncoder().username("akshay").password("akshay").roles("admin").build());
		users.add(User.withDefaultPasswordEncoder().username("aravind").password("aravind").roles("user").build());
		users.add(User.withDefaultPasswordEncoder().username("siddanna").password("siddanna").roles("user").build());
		return new InMemoryUserDetailsManager(users);
	}

}
