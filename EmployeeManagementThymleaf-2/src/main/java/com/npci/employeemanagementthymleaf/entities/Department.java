package com.npci.employeemanagementthymleaf.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

	@Id
	@Column(name = "DEPTNO")
	private int deptNo;
	
	@Column(name = "DNAME")
	private String deptName;
	
	@Column(name = "LOC")
	private String location;
	
	public Department() {
		
	}
	public Department(int deptNo, String deptName, String location) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.location = location;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + ", location=" + location + "]";
	}
	
	
}
