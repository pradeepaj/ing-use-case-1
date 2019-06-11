package com.ing.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.test.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByNameAndPassword(String name, String password);

	
}
