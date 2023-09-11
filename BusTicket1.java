package BusTicketBookingJDBC;
import java.util.Scanner;
public class BusTicket1 {

	public static void main(String[] args) {

		BusUpdates busUpdate = new BusUpdates();
		try {	
		busUpdate.displayBusInfo();
		
		  int start = 1; 
		  Scanner scanner = new Scanner(System.in); 
		  while (start == 1) {
		  System.out.println("Press 1 to Book and 2 to Exit"); 
		  start = scanner.nextInt(); 
		  if (start == 1) { 
			  Booking1 booking = new Booking1(); 
			  if(booking.isAvailable()) { 
				  BookingUpdates bookingUpdate = new BookingUpdates();
				  bookingUpdate.addBooking(booking);
		  System.out.println("Your Booking is Confirmed"); 
		  } 
			  else
		  System.out.println("Sorry. Bus is full, try another bus or date to continue"); 
			  } 
		  else if (start == 2) { 
			  System.out.println("Thank You"); 
			  break; 
			  } 
		  else
		  System.out.println("Please enter vaild number"); 
		  }
		 scanner.close();
		}
		catch(Exception e) {
			System.out.println("Server Down please wait");
		}
	}
}
