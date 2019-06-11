package com.ing.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class SubProducts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long subProductId;
	private String subProductName;
	
	@ManyToOne
	private Products product;
	
	public long getSubProductId() {
		return subProductId;
	}
	public void setSubProductId(long subProductId) {
		this.subProductId = subProductId;
	}
	public String getSubProductName() {
		return subProductName;
	}
	public void setSubProductName(String subProductName) {
		this.subProductName = subProductName;
	}
	
	
	public Products getProduct() {
		return product;
	}
	public void setProduct(Products product) {
		this.product = product;
	}

}
