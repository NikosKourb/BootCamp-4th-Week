package parkinglot;

public class Car extends Vehicle {


	final static double rate = 2;

	public Car() {}
	

public Car(String licenseNumber,String brand,String model,String colour) {
		super(licenseNumber,brand,model,colour);
	}


public String getLicenseNumber() {
	return licenseNumber;
}


public void setLicenseNumber(String licenseNumber) {
	this.licenseNumber = licenseNumber;
}


public String getBrand() {
	return brand;
}


public void setBrand(String brand) {
	this.brand = brand;
}


public String getModel() {
	return model;
}


public void setModel(String model) {
	this.model = model;
}


public String getColour() {
	return colour;
}


public void setColour(String colour) {
	this.colour = colour;
}



	
	
	
	

}
