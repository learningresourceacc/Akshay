package com.example.demoJPA.Repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demoJPA.Entities.User;


@Repository
public interface UserRepo extends CrudRepository<User, Long>{
	User findByUsername(String username);
}
