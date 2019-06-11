package com.ing.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.test.entity.SubProducts;
@Repository
public interface SubProductRepository extends JpaRepository<SubProducts, Long> {

}
