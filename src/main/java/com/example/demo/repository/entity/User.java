package com.example.demo.repository.entity;

import lombok.Data;

@Data
public class User {
	
	private Long id;
	
	private String name;
	
	private UserRole role;

}
