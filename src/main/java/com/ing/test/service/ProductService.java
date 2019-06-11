package com.ing.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.ing.test.entity.Products;



public interface ProductService {



	Products createUser(Products products);

	List<Products> AllProducts();
	List<Products> getProductsForUser(long userId);


}
