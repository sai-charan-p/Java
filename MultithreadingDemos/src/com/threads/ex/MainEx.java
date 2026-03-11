package com.threads.ex;

class Child extends Thread {
	String name;

	public Child(String name, int priority) {
		super(name);
		this.name = name;
		this.setPriority(priority);
		this.start();
	}

	@Override
	public void run() {
		System.out.println("Current thread: " + name);
		System.out.println("running");
		for (int i = 0; i < 10; i++) {
			System.out.println("5" + "x" + i + "=" + 5 * i+"By Child: "+name);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MainEx {
	public static void main(String[] args) {
//	Thread t=new child();
//	t.setName("thread1");
//	t.setPriority(Thread.MAX_PRIORITY-1);
//	t.start();//run method will be called automatically
//	t.run();

		try {
			Child t1 = new Child("Thread-11", 6);
			t1.join();
			Child t2 = new Child("Thread-12", 6);
			t2.join();
			Child t3 = new Child("Thread-13", 6);
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
