package com.viniciuscolutti.moonrain.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.viniciuscolutti.moonrain.services.DBService;
import com.viniciuscolutti.moonrain.services.EmailService;
import com.viniciuscolutti.moonrain.services.MockEmailService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		dbService.instantiateTestDatabase();
		return true;
	}
	
	
	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}
}
