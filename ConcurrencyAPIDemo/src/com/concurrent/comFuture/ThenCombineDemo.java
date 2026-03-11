package com.concurrent.comFuture;

import java.util.concurrent.CompletableFuture;

public class ThenCombineDemo {
public static void main(String[] args) {
	CompletableFuture<Integer> t1=CompletableFuture.supplyAsync(()->5);
	CompletableFuture<Integer> t2=CompletableFuture.supplyAsync(()->7);
	CompletableFuture<Integer> combined=t1.thenCombine(t2, (result1,result2)->result1+result2);
	
	combined.thenAccept(result->{
		System.out.println("combine result is: "+result);
	});
}
}
