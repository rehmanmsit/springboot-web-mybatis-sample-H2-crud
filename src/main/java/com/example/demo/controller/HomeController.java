package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.vo.UserVO;
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
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return homeService.fetchAllUsers();
	}
	
	@PostMapping(value = "/user", consumes = "application/json", produces = "application/json")
	public int addUser(@RequestBody UserVO userVO) {
		return homeService.addUser(userVO);
	}
	
	@DeleteMapping("/user")
	public int deleteUserById(@RequestParam(value = "id", required = true) Long id) {
		return homeService.deleteUser(id);
	}
	

}
