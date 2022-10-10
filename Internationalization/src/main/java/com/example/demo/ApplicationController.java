package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

	@Autowired
	MessageSource messageSource;
	
	@GetMapping("/")
	public String message() {
		return messageSource
				.getMessage("welcome.text", null,LocaleContextHolder.getLocale());
	}
	//welcome.text is the property name in message and message_fr properties file
}
