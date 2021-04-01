package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.vo.UserVO;
import com.example.demo.repository.HomeRepository;
import com.example.demo.repository.entity.User;
import com.example.demo.repository.entity.UserRole;


@Service
public class HomeServiceImpl implements HomeService {
	
	@Autowired
	private HomeRepository homeRepository;

	@Override
	public User findById(Long id) {
		
		return homeRepository.findUserById(id);
	}

	@Override
	public int addUser(UserVO userVO) {
		User user = new User();
		UserRole role = homeRepository.findUserRoleById(userVO.getRole().getId());
		user.setId(userVO.getId());
		user.setName(userVO.getName());
		user.setRole(role);
		return homeRepository.insertUser(user);
	}

	@Override
	public int deleteUser(Long id) {
		return homeRepository.deleteUserById(id);
	}

	@Override
	public List<User> fetchAllUsers() {
		return homeRepository.fetchAllUsers();
	}

}
