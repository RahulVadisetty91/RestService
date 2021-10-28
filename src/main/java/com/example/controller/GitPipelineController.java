package com.example.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
    import java.util.Calendar;

@RestController
public class GitPipelineController {

	private static final String template = "Hello, %s!";
	
	@GetMapping("/gitPipeline")
	public String healthCheck() {
		return String.format(template, "Git Pipeline!!");
	}
}
