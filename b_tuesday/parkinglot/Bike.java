package parkinglot;

public class Bike extends Vehicle {
	
	private String checkInDate;
	private String checkInTime;
	private String checkOutDate;
	private String checkOutTime;
	final static double rate = 0.5;

	public Bike() {
	}

	public Bike(String licenseNumber, String brand, String model, String colour) {
		super(licenseNumber, brand, model, colour);
	}

	public String getCheckInDate() {
		return checkInDate;
	}

	public String getCheckInTime() {
		return checkInTime;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public String getCheckOutTime() {
		return checkOutTime;
	}

	public static double getRate() {
		return rate;
	}

	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}

	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

}
