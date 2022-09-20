package com.assignment.actuator.Endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Endpoint(id="welcome")
@Component
public class CustomActuator {

	@Bean
	@ReadOperation
	public String welcome() {
		return "Hi, Welcome To Application,  This is Custom Actuator";
	}
}
