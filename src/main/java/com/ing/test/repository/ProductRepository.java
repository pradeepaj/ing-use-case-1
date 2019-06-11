package com.ing.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.test.entity.Products;
@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {
	//@Query("select p from Products p where id=:userId")
	List<Products> findProductsByUserid(Long userId);

}
