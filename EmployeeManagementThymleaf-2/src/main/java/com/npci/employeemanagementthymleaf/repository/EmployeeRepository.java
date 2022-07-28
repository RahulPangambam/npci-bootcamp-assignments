package com.npci.employeemanagementthymleaf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.employeemanagementthymleaf.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	public List<Employee> findByeName(String eName);
}
