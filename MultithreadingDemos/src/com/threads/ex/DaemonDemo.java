package com.threads.ex;

class MyRunner implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class DaemonDemo {
	public static void main(String[] args) {
		Runnable r = new MyRunner();
		Thread t = new Thread(r, "sai");
		t.setDaemon(true);
		t.start();
		Runnable r1 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread(r1);
		t2.start();
	}
}
