package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		System.out.println("Initiating RestService...");
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
