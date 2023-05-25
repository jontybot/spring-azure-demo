package com.example.SpringJavaDemoTushar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJavaDemoTusharApplication {
	
	@GetMapping
	public String function() {
		return "this demo springboot app is working";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJavaDemoTusharApplication.class, args);
	}

}
