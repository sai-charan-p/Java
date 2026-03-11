package com.excep.userdefined;

public class ATM {
public static void main(String[] args) {
	Bank b=new Bank(8000);
	try {
		b.withdraw(5001);
	} catch (ExceedingLimitsException e) {
		// TODO Auto-generated catch block
		System.out.println("problem occured: "+e.getMessage());
	} catch (MinBalanceException e) {
		// TODO Auto-generated catch block
		System.out.println("Issue:"+e.getMessage());
	}
}
}
