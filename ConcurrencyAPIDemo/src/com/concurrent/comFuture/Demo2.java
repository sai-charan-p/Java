package com.concurrent.comFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Demo2 {
public static void main(String[] args) {
	CompletableFuture<String> future= CompletableFuture.supplyAsync(()->{
		try {
			Thread.sleep(300);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		return "happy";
	});
	future.thenAccept(str->System.out.println(str.toUpperCase()));
	System.out.println("in Main");
	try {
		System.out.println(future.get());
	} catch (InterruptedException | ExecutionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
