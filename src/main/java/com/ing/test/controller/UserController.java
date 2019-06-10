package com.ing.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.test.entity.User;
import com.ing.test.service.UserService;

@RestController
@RequestMapping("/message")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping("userName/{name}/password/{password}")
	public String validateUser(@PathVariable String name, @PathVariable String password) {
		User user=userService.validUser(name, password);
		if(user.getName().equals(name) && user.getPassword().equals(password)) {
			return "valid user";
		}else
		{ 
			return "invalid user";
			}
		
	}
	


	}
