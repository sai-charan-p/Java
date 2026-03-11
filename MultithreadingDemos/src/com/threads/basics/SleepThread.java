package com.threads.basics;

public class SleepThread {
public static void main(String[] args) {
	Thread t=Thread.currentThread();
	System.out.println(t);
	for (int i = 0; i < 10; i++) {
		System.out.println("5"+"x"+i+"="+5*i);
	try {
		Thread.sleep(1500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
}
