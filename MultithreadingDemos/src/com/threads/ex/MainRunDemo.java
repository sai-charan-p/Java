package com.threads.ex;

class Runner implements Runnable{
String name;
	public Runner(String name, int priority) {
		super();
		this.name=name;
		Thread t=new Thread(this,name);
		t.setPriority(priority);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Greeter greeter=new Greeter();
		System.out.println(greeter.greetUser("sai"));
	}
	
}
public class MainRunDemo {
public static void main(String[] args) {
	Runner r=new Runner("Sai", 8);
	
}
}
