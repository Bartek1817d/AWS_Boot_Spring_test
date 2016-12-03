package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootTest2Application {
	
	@RequestMapping("/")
	String home() {
		return "Hello world 3";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTest2Application.class, args);
	}
}
