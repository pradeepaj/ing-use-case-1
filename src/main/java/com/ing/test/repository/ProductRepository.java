package com.ing.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.test.entity.Products;
@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {

}
