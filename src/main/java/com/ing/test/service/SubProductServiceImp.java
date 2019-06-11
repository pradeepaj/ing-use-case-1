package com.ing.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.test.entity.SubProducts;
import com.ing.test.repository.SubProductRepository;

@Service
public class SubProductServiceImp implements SubProductService {
@Autowired
	private SubProductRepository subProductRepository;
	
	@Override
	public SubProducts createSubProduct(SubProducts subProducts) {
		
		return subProductRepository.save(subProducts);
	}

}
