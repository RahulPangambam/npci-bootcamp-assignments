package com.npci.ecommercemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npci.ecommercemanagement.entities.Category;
import com.npci.ecommercemanagement.entities.Product;
import com.npci.ecommercemanagement.service.CategoryServiceImpl;
import com.npci.ecommercemanagement.service.ProductServiceImpl;

@RestController
@RequestMapping("/manage")
public class ECommerceManagementController {

	@Autowired
	ProductServiceImpl productService;
	
	@Autowired
	CategoryServiceImpl categoryService;
	
	@GetMapping("/prdList")
	public List<Product> findAll(){
		return productService.findAll();
	}
	
	@GetMapping("/prd/{id}")
	public Product findById(@PathVariable Integer id) throws Exception {
		Product p = productService.findById(id);
		if(p == null) {
			throw new Exception("Product with id: " + id + " details not found");
		}
		return p;
	}
	
	@PostMapping("/saveProduct")
	public String saveProduct(@RequestBody Product p) {
		productService.saveOrUpdate(p);

		return "Product details added successfully!!!";
	}

	@PutMapping("/updateProduct")
	public String updateProduct(@RequestBody Product p) throws Exception {
		
		productService.saveOrUpdate(p);
		
		return "Product ID : "+ p.getId() + " details updated Succesfully !!"; 
	}

	@DeleteMapping("del/{id}")
	public String deleteById(@PathVariable int id) {
		productService.delete(id);
		return "Product ID : " + id +"details  deleted !!!";
	}
	
	@GetMapping("/categoryList")
	public List<Category> findAllCategory(){
		return categoryService.findAll();
	}
	
	@GetMapping("/cat/{id}")
	public Category findByCategoryId(@PathVariable Integer id) throws Exception {
		Category c = categoryService.findById(id);
		if(c == null) {
			throw new Exception("Category with id: " + id + " details not found");
		}
		return c;
	}
	
	@PostMapping("/saveCategory")
	public String saveCategory(@RequestBody Category c) {
		categoryService.saveOrUpdate(c);

		return "Category details added successfully!!!";
	}

	@PutMapping("/updateCategory")
	public String updateCategory(@RequestBody Category c) throws Exception {
		
		categoryService.saveOrUpdate(c);
		
		return "Cayegory ID : "+ c.getCategoryId() + " details updated Succesfully !!"; 
	}

	@DeleteMapping("delCategory/{id}")
	public String deleteByCategoryId(@PathVariable int id) {
		categoryService.delete(id);
		return "Category ID : " + id +" details  deleted !!!";
	}

}
