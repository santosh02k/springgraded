package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootGradedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGradedApplication.class, args);
		System.out.println("Hello Dev-Ops");
	}

}
