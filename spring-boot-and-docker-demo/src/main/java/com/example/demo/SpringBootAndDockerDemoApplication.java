package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootAndDockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAndDockerDemoApplication.class, args);
	}
	
	@GetMapping("/docker")
	public String test() {
		return "Hello World!";
	}

}
