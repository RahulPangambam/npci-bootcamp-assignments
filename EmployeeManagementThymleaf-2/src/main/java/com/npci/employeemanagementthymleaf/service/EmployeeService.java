package com.npci.employeemanagementthymleaf.service;

import java.util.List;

import com.npci.employeemanagementthymleaf.entities.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	public void save(Employee e);
	public Employee findById(Integer id);
	public void deleteById(Integer id);
	public List<Employee> findByName(String name);
}
