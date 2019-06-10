package com.ing.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.test.entity.Products;
import com.ing.test.repository.ProductRepository;



@Service
public class ProductServiceImpl  implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Products createUser(Products products) {
		  return productRepository.save(products);
		
		
	}

	@Override
	public List<Products> AllProducts() {
		 return productRepository.findAll();
	
		
		
	}

}
