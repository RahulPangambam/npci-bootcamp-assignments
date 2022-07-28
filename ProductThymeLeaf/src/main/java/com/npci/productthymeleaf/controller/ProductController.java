package com.npci.productthymeleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.npci.productthymeleaf.entity.Product;
import com.npci.productthymeleaf.service.ProductServiceImpl;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductServiceImpl service;
	
	@GetMapping("/prdList")
	public String displayEmployees(Model model){
		List<Product> products = service.findAll();
		
		model.addAttribute("PRODUCT", products);
		
		return "prdUI/products.html";
	}
	
	@GetMapping("/showForm")
	public String empForm(Model model) {
		model.addAttribute("PRODUCT", new Product());
		
		return "prdUI/productForm.html";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("PRODUCT") Product p) {
		service.save(p);
		return "redirect:/product/prdList";
	}
	
	@GetMapping("/updateForm")
	public String updateForm(@RequestParam("prdId") Integer id, Model model) {
		Product p = service.findById(id);
		model.addAttribute("PRODUCT",p);
		return "prdUI/productForm.html";
	}
	
	@GetMapping("/delete")
	public String deleteById(@RequestParam("prdId") Integer id) {
		service.deleteById(id);
		
		return "redirect:/product/prdList";
	}
	
	@GetMapping("/search")
	public String searchProduct(@ModelAttribute("PRODUCT") Product p, Model model){
		List<Product> products = service.findByName(p.getName());
		model.addAttribute("PRODUCT", products);
		
		return "prdUI/products.html";
	}
	@GetMapping("/showSearchForm")
	public String searchForm(Model model) {
		model.addAttribute("PRODUCT", new Product());
		return "prdUI/searchForm.html";
	}
}
