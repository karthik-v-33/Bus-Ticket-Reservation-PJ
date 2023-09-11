package BusTicketBookingJDBC;

import java.util.Date;
import java.sql.*;
public class BookingUpdates {
	public int getBookedCount(int busNo,Date date) throws Exception {
		String query = "select count(passenger_name) from booking where bus_no =? and travel_date =?";
		Connection con = DBConnector.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		pst.setInt(1, busNo);
		pst.setDate(2, sqldate);
		ResultSet rs = pst.executeQuery();
		rs.next();
		return rs.getInt(1);
		
	}
	public void addBooking(Booking1 booking) throws Exception{
		String query = "insert into booking values (?,?,?)";
		Connection con = DBConnector.getConnection();
		java.sql.Date sqldate = new java.sql.Date(booking.date.getTime());
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, booking.passengerName);
		pst.setInt(2, booking.busNo);
		pst.setDate(3, sqldate);
		
		pst.executeUpdate();
	}
}
