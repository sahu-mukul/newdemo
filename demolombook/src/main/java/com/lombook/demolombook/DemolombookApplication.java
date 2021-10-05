package com.lombook.demolombook;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@SpringBootApplication
@EnableWebSecurity
public class DemolombookApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemolombookApplication.class, args);
	}
}
