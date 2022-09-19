package com.example.demoJPA.Exceptions;

import java.time.LocalDateTime;

public class CustomExceptionClass {

	private String message;
	
	private String description;
	
	private LocalDateTime localDateTime;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public CustomExceptionClass(String message, String description, LocalDateTime localDateTime) {
		super();
		this.message = message;
		this.description = description;
		this.localDateTime = localDateTime;
	}

	public CustomExceptionClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
