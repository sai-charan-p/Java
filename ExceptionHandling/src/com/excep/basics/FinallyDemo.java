package com.excep.basics;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String val = args[0];
			System.out.println("Argument enter is: " + val);
			int a = Integer.parseInt(val);
			System.out.println("Interger is: " + a);
			int b = 10 / a;
			System.out.println("Result is : " + b);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
			System.out.println("ArithmeticException Occurred");
		}finally {
			System.out.println("Closing the database");
		}
	}

}
