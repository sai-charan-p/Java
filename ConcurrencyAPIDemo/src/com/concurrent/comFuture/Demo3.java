package com.concurrent.comFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Demo3 {
	public static void main(String[] args) {
		CompletableFuture<String> t1 = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "completed task1";
		});

		CompletableFuture<String> t2 = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "completed task2";
		});
		CompletableFuture<Void> allof = CompletableFuture.allOf(t1, t2);

		allof.thenRunAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			try {
				System.out.println(t1.get() + " " + t2.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		CompletableFuture<Object> anyof = CompletableFuture.anyOf(t1, t2);
		anyof.thenAcceptAsync(str -> System.out.println("hey"+str));
		try {
			System.out.println("hi"+anyof.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main thread");
	}
}
