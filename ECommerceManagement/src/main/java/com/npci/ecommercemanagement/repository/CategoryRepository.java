package com.npci.ecommercemanagement.repository;

import java.util.List;

import com.npci.ecommercemanagement.entities.Category;

public interface CategoryRepository {
	public List<Category> findAll();
	public Category findById(Integer id);
	public void saveOrUpdate(Category c);
	public void delete(Integer id);
}
