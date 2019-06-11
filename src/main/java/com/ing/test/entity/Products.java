package com.ing.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long prdouctId;
	private String productName;
	@ManyToOne
	private User user;
	
	

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Products() {

	}

	public long getPrdouctId() {
		return prdouctId;
	}

	public void setPrdouctId(long prdouctId) {
		this.prdouctId = prdouctId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Products(long prdouctId, String productName) {
		super();
		this.prdouctId = prdouctId;
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Products [prdouctId=" + prdouctId + ", productName=" + productName + "]";
	}
	

}
