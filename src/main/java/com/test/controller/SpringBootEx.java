package com.test.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.flight")
@EnableJpaRepositories("com.flight.dao")
@EntityScan("com.flight")

public class SpringBootEx {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootEx.class, args);

	}

}
