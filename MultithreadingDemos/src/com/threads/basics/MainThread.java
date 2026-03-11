package com.threads.basics;

public class MainThread {
public static void main(String[] args) {
	Thread t=Thread.currentThread();
	System.out.println(t);
	t.setName("pop");
	System.out.println(t);
	int x=10/0;
}
}
