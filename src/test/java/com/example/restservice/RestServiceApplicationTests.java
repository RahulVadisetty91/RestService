package com.example.restservice;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import com.example.controller.GitPipelineController;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
public class RestServiceApplicationTests {

	@Autowired
	GitPipelineController controller;
	
	@Test
	public void contextLoads() {
		System.out.println("Response from Controller: " + controller.healthCheck());
	}
}
