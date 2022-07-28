package com.npci.employeemanagementthymleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.employeemanagementthymleaf.entities.Employee;
import com.npci.employeemanagementthymleaf.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository repository;
	
	@Override
	public List<Employee> findAll() {
		return repository.findAll();
	}

	@Override
	public void save(Employee e) {
		repository.save(e);
		
	}

	@Override
	public Employee findById(Integer id) {
		Optional<Employee> e = repository.findById(id);
		Employee emp = null;

		if(e.isPresent())
			emp = e.get();
		
		return emp;

	}

	public void deleteById(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public List<Employee> findByName(String name) {
		return repository.findByeName(name);
	}
	

}
