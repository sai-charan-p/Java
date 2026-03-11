package com.inter.demo;

public class Manager extends Employee implements IArtsClub {

	String department;

	public Manager(String employeeName, int employeeId, String city, String department) {
		super(employeeName, employeeId, city);
		this.department = department;
	}

	@Override
	public void showActivies() {
		System.out.println("activities shown");

	}

	@Override
	public void showPolicyDetails() {
		System.out.println("Policy provided for health");

	}

	@Override
	public void artWorkshopDetails() {
		// TODO Auto-generated method stub
		System.out.println("artworkshopdetails");
	}

	@Override
	public String[] artClasses() {
		// TODO Auto-generated method stub
		return new String[] {"canvas","oil paint"};
	}

	@Override
	void projectDetails() {
		// TODO Auto-generated method stub
		System.out.println("for banking domain");
		System.out.println("Using java fullstack");

	}

	@Override
	void calcBonus(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Diwali bonus");

	}
	public String[] reporteesList() {
		return new String [] {"raju","rakesh"};
	}

}
