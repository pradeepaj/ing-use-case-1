package com.ing.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ing.test.entity.Products;
import com.ing.test.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByNameAndPassword(String name, String password);

	
}
