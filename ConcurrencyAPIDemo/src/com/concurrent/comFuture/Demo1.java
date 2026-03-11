package com.concurrent.comFuture;

import java.util.concurrent.CompletableFuture;

public class Demo1 {
	public static void main(String[] args) {
		CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() -> "hello");
		
		task1.thenAccept((str) -> System.out.println(str.toUpperCase()));

		CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> "then Apply");
		task2.thenApply(str -> {
			System.out.println("message received: " + str);
			return "hey " + str;
		}).thenApply(str -> {
			System.out.println("message in upper case: " + str.toUpperCase());
			return str.length();
		}).thenAccept(str -> System.out.println("returning length: " + str));
	}
}
