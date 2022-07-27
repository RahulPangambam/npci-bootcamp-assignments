package com.npci.ecommercemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.ecommercemanagement.entities.Product;
import com.npci.ecommercemanagement.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository repository;
	
	@Override
	public List<Product> findAll() {
		return repository.findAll();
	}

	@Override
	public Product findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void saveOrUpdate(Product p) {
		repository.saveOrUpdate(p);
		
	}

	@Override
	public void delete(Integer id) {
		repository.delete(id);
		
	}

}
