package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SampleWebMybatisCrudExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleWebMybatisCrudExampleApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
			
		};
	}

}
