package com.npci.productthymeleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.productthymeleaf.entity.Product;
import com.npci.productthymeleaf.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository repository;
	
	@Override
	public List<Product> findAll() {
		return repository.findAll();
	}

	@Override
	public void save(Product p) {
		repository.save(p);
		
	}

	@Override
	public Product findById(Integer id) {
		Optional<Product> p = repository.findById(id);
		Product product = null;
		
		if(p.isPresent())
			product = p.get();
		return product;
	}

	@Override
	public void deleteById(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public List<Product> findByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public List<Product> findByCategoryId(Integer id) {
		return repository.findByCategoryId(id);
	}

}
