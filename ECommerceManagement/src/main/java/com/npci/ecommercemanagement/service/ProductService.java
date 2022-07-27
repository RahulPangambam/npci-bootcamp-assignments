package com.npci.ecommercemanagement.service;

import java.util.List;

import com.npci.ecommercemanagement.entities.Product;

public interface ProductService {
	public List<Product> findAll();
	public Product findById(Integer id);
	public void saveOrUpdate(Product p);
	public void delete(Integer id);
}
