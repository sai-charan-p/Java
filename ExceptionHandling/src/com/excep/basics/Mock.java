package com.excep.basics;

public class Mock {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
		try {
			print(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}catch(ArithmeticException e) {
			System.out.println("Exception");
//			throw e;
		}
		System.out.println("main end");
	}
	public static void print(int b) throws Exception{
		int a=100;
		try {
		System.out.println(a/b);
		throw new Exception();
		}catch(Exception e) {
			throw e;
		}
		finally {
			System.out.println("Close");
		}
//		System.out.println("print end");
	}
}
