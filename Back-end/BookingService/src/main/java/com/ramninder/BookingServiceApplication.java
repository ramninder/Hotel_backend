package com.ramninder;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class BookingServiceApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(BookingServiceApplication.class, args);
	} 
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
	 return new BCryptPasswordEncoder();
	}

}
