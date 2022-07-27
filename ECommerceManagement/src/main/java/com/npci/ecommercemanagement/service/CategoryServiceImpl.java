package com.npci.ecommercemanagement.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.ecommercemanagement.entities.Category;
import com.npci.ecommercemanagement.repository.CategoryRepositoryImpl;
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepositoryImpl repository;
	
	@Override
	public List<Category> findAll() {
		return repository.findAll();
	}

	@Override
	public Category findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void saveOrUpdate(Category c) {
		repository.saveOrUpdate(c);
		
	}

	@Override
	public void delete(Integer id) {
		repository.delete(id);
		
	}

}
