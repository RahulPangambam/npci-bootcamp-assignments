package com.npci.productthymeleaf.service;

import java.util.List;

import com.npci.productthymeleaf.entity.Product;

public interface ProductService {
	public List<Product> findAll();
	public void save(Product p);
	public Product findById(Integer id);
	public void deleteById(Integer id);
	public List<Product> findByName(String name);
}
