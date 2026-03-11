package com.dev.app.model;

public class Employee {
	
	public int empId;
	public String empName;
	public String deptment;
	public String age;
	public int salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDeptment() {
		return deptment;
	}
	public void setDeptment(String deptment) {
		this.deptment = deptment;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int empId, String empName, String deptment, String age, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptment = deptment;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", deptment=" + deptment + ", age=" + age
				+ ", salary=" + salary + "]";
	}

}
