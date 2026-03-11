package com.excep.userdefined;

public class Bank {
	double balance;
	public Bank(double balance) {
		super();
		this.balance=balance;
	}
	void withdraw(double amount) throws ExceedingLimitsException, MinBalanceException {
		try {
		System.out.println("in bank");
		if(amount>5000)
			throw new ExceedingLimitsException("amount should be less then 5000");
		
		if(balance-amount<2000)
			throw new MinBalanceException("Min balance should be maintained");
		
		balance-=amount;
		System.out.println("amount withdrawn successfully");
//		}catch(Exception e) {
//			throw e;
		}finally {
			System.out.println("closing the connection");
		}
	}
}
