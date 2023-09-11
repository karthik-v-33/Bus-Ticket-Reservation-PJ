package BusTicketBookingJDBC;
import java.sql.*;
public class BusUpdates {
	public void displayBusInfo() throws Exception {
		String query = "select * from bus";
		Connection con = DBConnector.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Bus No : " + rs.getInt(1));
			if(rs.getInt(2)==0) 
				System.out.println("AC : No");
			else
				System.out.println("AC : Yes");
			System.out.println("Capacity : " + rs.getInt(3));
		}
		
	}
	public int getCapacity(int id) throws Exception {
		String query = "select capacity from bus where id = "+id;
		Connection con = DBConnector.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
	}
}
