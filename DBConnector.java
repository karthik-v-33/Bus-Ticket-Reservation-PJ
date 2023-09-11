package BusTicketBookingJDBC;
import java.sql.*;
public class DBConnector {
	private static String url = "jdbc:mysql://localhost:3306/busticket";
	private static String userName = "root";
	private static String password = "3310";
	public static Connection getConnection() throws Exception{
		return DriverManager.getConnection(url, userName, password);
	}
}
