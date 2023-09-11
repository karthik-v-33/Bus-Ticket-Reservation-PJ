package BusTicketBookingJDBC;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Booking1 {
	String passengerName;
	int busNo;
	Date date;

	public Booking1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name : ");
		passengerName = scanner.nextLine();
		System.out.println("Enter your Bus no : ");
		busNo = scanner.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public boolean isAvailable() throws Exception{
		BusUpdates busUpdate = new BusUpdates();
		BookingUpdates bookingUpdate = new BookingUpdates();
		int capacity = busUpdate.getCapacity(busNo);
		
		int booked = bookingUpdate.getBookedCount(busNo,date);
		return booked<capacity;
	}
}
