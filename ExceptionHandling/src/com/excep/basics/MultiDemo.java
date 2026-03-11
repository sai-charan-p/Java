package com.excep.basics;

public class MultiDemo {

	public static void main(String[] args) {
		try {
		String val=args[0];
		System.out.println("Argument enter is: "+val);
		int a=Integer.parseInt(val);
		System.out.println("Interger is: "+ a);
		int b=10/a;
		System.out.println("Result is : "+b);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
			System.out.println("ArithmeticException Occurred");
		}
	}

}
