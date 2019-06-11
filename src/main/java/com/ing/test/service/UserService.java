package com.ing.test.service;

import java.util.List;

import com.ing.test.entity.Products;
import com.ing.test.entity.User;


public interface UserService {

	User createUser(User user);

	User validUser(String name, String password);

	void deleteUser(int userid);

	
	//List<Products> getProductsForUser(long userId);

}
