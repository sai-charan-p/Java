package com.concurrent.comFuture;

import java.util.function.Supplier;
import java.util.function.Consumer;

public class FunDemo {
	
	static void printMessage(Supplier<String> s) {
		System.out.println(s.get().toUpperCase());
	}
	static void getMessage(Consumer<String> c, String s) {
		System.out.println(s);
		c.accept(s);
	}
	public static void main(String[] args) {
		Supplier<String> sup = () -> "have a good day";
		System.out.println(sup.get());
		Supplier<Integer> num = () -> 100;
		System.out.println(num.get());
		
		printMessage(()->"hello");
		getMessage((str)->System.out.println(str.toUpperCase()), "get-");
	}
}
