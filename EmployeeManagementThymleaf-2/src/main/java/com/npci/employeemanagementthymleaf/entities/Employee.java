package com.npci.employeemanagementthymleaf.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPNO")
	private Integer empNo;
	
	@Column(name = "ENAME")
	private String eName;
	
	@Column(name = "JOB")
	private String job;
	
	@Column(name = "HIREDATE")
	private String hireDate;
	
	@Column(name = "MANAGERID")
	private Integer managerId;
	
	@Column(name = "SALARY")
	private Integer salary;
	
	@Column(name = "COMMISSION")
	private Integer commission;
	
	@Column(name = "DEPTNO")
	private Integer deptNo;
	
	public Employee() {
		
	}

	public Employee(Integer empNo, String eName, String job, String hireDate, Integer managerId, Integer salary, Integer commission,
			Integer deptNo) {
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		this.hireDate = hireDate;
		this.managerId = managerId;
		this.salary = salary;
		this.commission = commission;
		this.deptNo = deptNo;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmoNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getCommission() {
		return commission;
	}

	public void setCommission(Integer commission) {
		this.commission = commission;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", eName=" + eName + ", job=" + job + ", hireDate=" + hireDate
				+ ", managerId=" + managerId + ", salary=" + salary + ", commission=" + commission + ", deptNo="
				+ deptNo + "]";
	}
		
}
