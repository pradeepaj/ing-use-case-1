package com.ing.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.test.entity.Products;
import com.ing.test.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Products createUser(Products products) {
		return productRepository.save(products);

	}

	public List<Products> AllProducts() {
		return productRepository.findAll();

	}
	/*
	 * @Override public List<Products> getProductsForUser(long userId) { // TODO
	 * Auto-generated method stub return productRepository.findById(userId)); }
	 */

	public List<Products> getProductsForUser(int userId) {

		return productRepository.findProductsByUserId(userId);

	}

	public Products getProductById(long prodId) {

		return productRepository.getOne(prodId);
	}

}
