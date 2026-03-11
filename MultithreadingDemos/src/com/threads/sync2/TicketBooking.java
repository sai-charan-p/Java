package com.threads.sync2;

public class TicketBooking {
	int totalTickets=600;
	final double cost=120;
	double bookTicket(String passenger, int noOfTickets)	 {
		System.out.println("Booking ticket for: "+ passenger);
		System.out.println("Tickets needed: "+noOfTickets);
		
		
		if(totalTickets-noOfTickets<=0) {
			throw new RuntimeException("no tickets");
		}
		totalTickets-=noOfTickets;
		System.out.println("available tickets"+totalTickets);
		//connect to the dataabase to check for no of tickets
		//if tickets are abailanle then book 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double price= cost*noOfTickets;
		System.out.println("total price is: "+price);
		return price;
	}
}
