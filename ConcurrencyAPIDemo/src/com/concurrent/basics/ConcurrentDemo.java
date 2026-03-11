package com.concurrent.basics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentDemo {
	public static void main(String[] args) {
		ExecutorService service1 = Executors.newFixedThreadPool(10);
		ExecutorService service2 = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 5; i++) {
			service1.execute(() -> {
				System.out.println(Thread.currentThread().getName());
			});
			service2.execute(() -> {
				System.out.println(Thread.currentThread().getName());
			});
		}

	}
}
