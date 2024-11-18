package com.example.INF5153_TP2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Inf5153Tp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Inf5153Tp2Application.class, args);
	}

	@GetMapping
	public List<String> hello() {
		return List.of("Hello", "World");
	}
}
