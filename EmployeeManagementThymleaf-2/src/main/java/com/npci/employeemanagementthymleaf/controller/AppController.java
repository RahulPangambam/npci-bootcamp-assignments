package com.npci.employeemanagementthymleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.npci.employeemanagementthymleaf.entities.Employee;
import com.npci.employeemanagementthymleaf.service.EmployeeServiceImpl;

@Controller
@RequestMapping("/employee")
public class AppController {

	@Autowired
	EmployeeServiceImpl service;
	
	@GetMapping("/empList")
	public String displayEmployees(Model model){
		List<Employee> employees = service.findAll();
		
		model.addAttribute("EMPLOYEE", employees);
		
		return "empUI/employees.html";
	}
	
	@GetMapping("/showForm")
	public String empForm(Model model) {
		model.addAttribute("EMPLOYEE", new Employee());
		
		return "empUI/employeeForm.html";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("EMPLOYEE") Employee emp) {
		service.save(emp);
		return "redirect:/employee/empList";
	}
	
	@GetMapping("/updateForm")
	public String updateForm(@RequestParam("empId") Integer id, Model model) {
		Employee emp = service.findById(id);
		model.addAttribute("EMPLOYEE",emp);
		return "empUI/employeeForm.html";
	}
	
	@GetMapping("/delete")
	public String deleteById(@RequestParam("empId") Integer id) {
		service.deleteById(id);
		
		return "redirect:/employee/empList";
	}
	@GetMapping("/search")
	public String searchEmployee(@ModelAttribute("EMPLOYEE") Employee emp, Model model){
		List<Employee> employees = service.findByName(emp.geteName());
		model.addAttribute("EMPLOYEE", employees);
		
		return "empUI/employees.html";
	}
	@GetMapping("/showSearchForm")
	public String searchForm(Model model) {
		
		model.addAttribute("EMPLOYEE", new Employee());
		return "empUI/searchForm.html";
	}

}
