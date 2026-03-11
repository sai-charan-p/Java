package com.threads.sync2;

public class Counter implements Runnable {
	String PassengerName;
	int noOfTickets;
	TicketBooking booking;

	public Counter(String passengerName, int noOfTickets, TicketBooking booking) {
		super();
		PassengerName = passengerName;
		this.noOfTickets = noOfTickets;
		this.booking=booking;
		Thread t=new Thread(this,passengerName);
		t.start();
	}

	@Override
	public void run() {
		synchronized (booking) {
			// TODO Auto-generated method stub
			System.out.println("Welcome to online ticket booking");
			System.out.println("checking details");
			System.out.println("Welcome: " + PassengerName);
			double totalPrice = booking.bookTicket(PassengerName, noOfTickets);
			System.out.println("Booking amount: " + totalPrice);
			System.out.println();
		}
		
	}

}
