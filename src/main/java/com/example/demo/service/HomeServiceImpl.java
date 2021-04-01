package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.HomeRepository;
import com.example.demo.repository.entity.User;


@Service
public class HomeServiceImpl implements HomeService {
	
	@Autowired
	private HomeRepository homeRepository;

	@Override
	public User findById(Long id) {
		
		return homeRepository.findUserById(id);
	}

}
