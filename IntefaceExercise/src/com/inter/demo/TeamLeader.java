package com.inter.demo;

public abstract class TeamLeader extends Employee implements IGames{
	double salary;
	@Override
	public void showPolicyDetails() {
		// TODO Auto-generated method stub
		System.out.println("TL policy");
	}

	public TeamLeader(String employeeName, int employeeId, String city, double salary) {
		super(employeeName, employeeId, city);
		this.salary = salary;
	}

	

	@Override
	void projectDetails() {
		// TODO Auto-generated method stub
		System.out.println("For Ecommerce domain");
	}

	@Override
	void calcBonus(double amount) {
		// TODO Auto-generated method stub
		System.out.println("diwali TL bonus");
	}
	@Override
	public String[] indoor() {
		// TODO Auto-generated method stub
		return new String[] {"chess","table"};
	}
	String[] mandateCertifications() {
		return new String[] {"cloud","java"};
	}

}
