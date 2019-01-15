package parkinglot;

public class Vehicle {
	protected String licenseNumber;
	protected String brand;
	protected String model;
	protected String colour;
	private String checkInDate;
	private String checkInTime;
	private String checkOutDate;
	private String checkOutTime;
	private long millisStart = 0;
	private long milliEnd = 0;
	

	public Vehicle() {};
	public Vehicle(String licenseNumber,String brand,String model,String colour) {
		this.licenseNumber = licenseNumber;
		this.brand = brand;
		this.model = model;
		this.colour = colour;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public String getColour() {
		return colour;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColour(String colour) {
		this.colour = colour;
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
	public long getMillisStart() {
		return millisStart;
	}
	public long getMilliEnd() {
		return milliEnd;
	}
	public void setMillisStart(long millisStart) {
		this.millisStart = millisStart;
	}
	public void setMilliEnd(long milliEnd) {
		this.milliEnd = milliEnd;
	}

}
