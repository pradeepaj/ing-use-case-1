package com.ing.test.service;

import java.util.List;

import com.ing.test.entity.Products;



public interface ProductService {



	Products createUser(Products products);

	List<Products> AllProducts();
	List<Products> getProductsForUser(int userId);

	Products getProductById(long prodId);

	

	


}
