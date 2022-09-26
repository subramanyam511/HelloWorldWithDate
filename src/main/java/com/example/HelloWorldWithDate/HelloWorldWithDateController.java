package com.example.HelloWorldWithDate;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldWithDateController {

	@GetMapping("/welcome")
	public String getmsg() {
		return "Hello world";
	}
	
	@GetMapping("/date")
	public LocalDateTime getdate() {
		LocalDateTime curreLocalDateTime=LocalDateTime.now();
		return curreLocalDateTime; 
		
	}
	
}
