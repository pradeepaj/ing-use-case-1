package com.ing.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.test.entity.Products;
import com.ing.test.entity.SubProducts;
import com.ing.test.entity.User;
import com.ing.test.service.ProductService;
import com.ing.test.service.UserService;

@RestController
@RequestMapping("/message")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private ProductService productService;

	
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping("userName/{name}/password/{password}")
	public String validateUser(@PathVariable String name, @PathVariable String password) {
		User user=userService.validUser(name, password);
		if(user!=null&& user.getName().equals(name) && user.getPassword().equals(password)) {
			return "valid user";
		}else
		{ 
			return "invalid user";
			}
		
	}
	
	@GetMapping("/getProducts/{userId}")
	public List<Products> getProducts(@PathVariable("userId")int userId){
		return productService.getProductsForUser(userId);
	}
     
	@GetMapping
	public List<SubProducts> getSubProductsByProductId(@PathVariable("prodId")long prodId){
		List<SubProducts> list=null;
		if(productService.getProductById(prodId)!=null) {
			return productService.getProductById(prodId).getSubProducts();
		}
		else
			return list;
	}
	

	}
