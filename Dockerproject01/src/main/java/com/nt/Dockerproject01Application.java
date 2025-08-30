package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Dockerproject01Application
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Docker Spring Boot Application");
		SpringApplication.run(Dockerproject01Application.class, args);
	}
}
