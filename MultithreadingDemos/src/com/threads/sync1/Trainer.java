package com.threads.sync1;

public class Trainer {
	String name;
	
public Trainer(String name) {
		super();
		this.name = name;
	}

String askDoubts(String studentName, String question) {
	System.out.println("Student name: "+studentName);
	System.out.println("Question: "+question);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return "Answered";
}
}
