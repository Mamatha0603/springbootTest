package com.test.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.test")
@EntityScan("com.test")
public class SpringBootEx {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootEx.class, args);

	}

}
