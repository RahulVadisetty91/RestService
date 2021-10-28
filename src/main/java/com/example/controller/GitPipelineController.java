package com.example.controller;

import java.util.concurrent.atomic.AtomicLong;
   import java.util.Calendar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitPipelineController {

	private static final String template = "Hello, %s!";
	
	@GetMapping("/gitPipeline")
	public String healthCheck() {
		return String.format(template, "Git Pipeline!!");
	}
}
