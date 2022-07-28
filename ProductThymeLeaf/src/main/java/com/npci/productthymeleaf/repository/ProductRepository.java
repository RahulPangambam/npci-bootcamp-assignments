package com.npci.productthymeleaf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.productthymeleaf.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	public List<Product> findByName(String name);
	public List<Product> findByCategoryId(Integer id);

}
