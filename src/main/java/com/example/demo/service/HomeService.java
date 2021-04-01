package com.example.demo.service;

import com.example.demo.repository.entity.User;

public interface HomeService {
	
	User findById(Long id);

}
