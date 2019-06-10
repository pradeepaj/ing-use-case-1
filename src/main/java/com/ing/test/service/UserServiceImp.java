package com.ing.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.test.entity.User;
import com.ing.test.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User validUser(String name, String password) {
		return userRepository.findByNameAndPassword(name, password);
		
	}

}



