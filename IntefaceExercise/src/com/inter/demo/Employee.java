package com.inter.demo;

public abstract class Employee implements IInsurance, IActivityClub {
private String employeeName;
private int employeeId;
private String city;
public Employee(String employeeName, int employeeId, String city) {
	super();
	this.employeeName = employeeName;
	this.employeeId = employeeId;
	this.city = city;
}
void printDetails() {
	System.out.println("Employee name: "+employeeName);
	System.out.println("Employee ID: "+employeeId);
	System.out.println("Employee department: "+city);
}
abstract void projectDetails();
abstract void calcBonus(double amount);
}
