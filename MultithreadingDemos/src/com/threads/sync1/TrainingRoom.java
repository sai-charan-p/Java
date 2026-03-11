package com.threads.sync1;

public class TrainingRoom implements Runnable {
	String studentName;
	String question;
	Trainer trainer;

	public TrainingRoom(String studentName, String question, Trainer trainer) {
		super();
		this.studentName = studentName;
		this.question = question;
		this.trainer = trainer;
		Thread th = new Thread(this, studentName);
		th.start();
	}

	@Override
	public void run() {
		synchronized (trainer) {
			System.out.println(trainer.askDoubts(studentName, question));
			System.out.println("Doubts cleared");
		}
	}
}
