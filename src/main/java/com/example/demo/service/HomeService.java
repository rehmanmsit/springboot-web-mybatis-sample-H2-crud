package com.example.demo.service;

import java.util.List;

import com.example.demo.controller.vo.UserVO;
import com.example.demo.repository.entity.User;

public interface HomeService {
	
	User findById(Long id);
	
	List<User> fetchAllUsers();
	
	int addUser(UserVO userVO);
	
	int deleteUser(Long id);

}
