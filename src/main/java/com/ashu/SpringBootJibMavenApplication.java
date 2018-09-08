package com.ashu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootJibMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJibMavenApplication.class, args);
	}

	@GetMapping("/")
	String message() {
		return "Spring Boot + Jib maven plugin sample application.";
	}

}
