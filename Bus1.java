package BusTicketBookingJDBC;

public class Bus1 {
	private int busNo;
	private boolean ac;
	private int capacity;
	public int getBusNo() {
		return busNo;
	}
	public Bus1(int no,boolean ac,int cap) {
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	public boolean getAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
