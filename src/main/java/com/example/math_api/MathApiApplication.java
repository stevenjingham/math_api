package com.example.math_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MathApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MathApiApplication.class, args);
	}
}
