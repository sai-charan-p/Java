package com.threads.sync1;

public class Institute{

	public static void main(String[] args) {
		Trainer trainer=new Trainer("william");
		TrainingRoom t1=new TrainingRoom("sai","what is a thread", trainer);
		TrainingRoom t2=new TrainingRoom("charan","what is a method overloading", trainer);
	}

}
