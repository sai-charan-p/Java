package com.concurrent.sync;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallCustomer {
public static void main(String[] args) {
	Bank b=new Bank();
	ExecutorService e=Executors.newFixedThreadPool(10);
	Callable<Double> c1= ()->{
		double d=b.getInterest(100);
		return d;
	};
	Future<Double> f1=e.submit(c1);
	try {
//		System.out.println(f1.cancel(true));
		System.out.println(f1.isDone());
		System.out.println(f1.get());
		System.out.println(f1.isDone());
	} catch (InterruptedException | ExecutionException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
}
