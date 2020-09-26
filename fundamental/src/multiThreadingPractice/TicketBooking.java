package multiThreadingPractice;

public class TicketBooking {
	public static void main(String[] args) {
	/*	Seat seat = new Seat();
		Runnable run = () -> {
			seat.bookTicket(3);
		};
		Runnable run1 = () -> {
			seat.bookTicket(2);
		};
		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run1);
		t1.start();
		t2.start();*/
		Seat seat=new Seat();
		Thread t1=new Thread(()->{
			seat.bookTicket(3);
		});
		Thread t2=new Thread(()->{
			seat.bookTicket(2);
		}) ;
		t1.start();
		t2.start();

	}
}

class Seat {
	private int totalTicket = 5;

	public void bookTicket(int ticket) {
		if (ticket <= totalTicket) {
			totalTicket = totalTicket - ticket;
			System.out.println(ticket + " Ticket is Booked");
		}
	}

}
