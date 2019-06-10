package com.ing.test.service;

import com.ing.test.entity.User;

public interface UserService {

	User createUser(User user);

	User validUser(String name, String password);

}
