package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfilingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfilingApplication.class, args);
		System.out.println("Checking Profiles");
	}

}
