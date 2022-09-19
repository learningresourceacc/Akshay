package com.example.demoJPA.Exceptions;

import java.time.LocalDateTime;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler{
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException exception) {
		CustomExceptionClass object=
				new CustomExceptionClass(exception.getMessage(),"Resource you try to access is not Found",LocalDateTime.now());
		
		return new ResponseEntity<Object>(object,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<Object> handleResourceNotFoundException(NullPointerException exception) {
		CustomExceptionClass object=
				new CustomExceptionClass(exception.getMessage(),"You try to access the data from null object",LocalDateTime.now());
		return new ResponseEntity<Object>(object,HttpStatus.NOT_FOUND);
	}
}
