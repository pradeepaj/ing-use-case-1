package com.ing.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.test.entity.Products;
import com.ing.test.entity.SubProducts;
import com.ing.test.service.ProductService;
import com.ing.test.service.SubProductService;



@RestController
@RequestMapping("products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	@Autowired
	private SubProductService subProductService;
	@PostMapping("insert-products")
	public Products insertProduct(@RequestBody Products products) {
		return productService.createUser(products);
	}
	@GetMapping("/all-products")
	public List<Products> getAllProducts(){
		return productService.AllProducts();
		
	}
	@PostMapping("/insert-subproducts")
	public SubProducts createSubProduct(@RequestBody SubProducts subProducts) {
		return subProductService.createSubProduct(subProducts);
		
	}
	

}
