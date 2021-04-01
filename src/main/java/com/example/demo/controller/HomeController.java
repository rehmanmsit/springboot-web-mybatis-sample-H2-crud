package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.entity.User;
import com.example.demo.service.HomeService;

@RestController
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	@GetMapping("/user")
	public User getUserById(@RequestParam(value = "id", required = true) Long id) {
		return homeService.findById(id);
	}

}
