package parkinglot;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Employee extends Parking{
	private String nameEmp;
	private int count = 0;
	private int fp = 0;
	

	public Employee(String name) {
		nameEmp = name;
	}



	public String getNameEmp() {
		return nameEmp;
	}

	public void setNameEmp(String nameEmp) {
		this.nameEmp = nameEmp;
	}

	public String currentTime() {
		long currentTime = System.currentTimeMillis();
		Date time = new Date(currentTime);
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String cTime = sdf.format(time);
		return cTime;
	}

	public String currentDate() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date today = Calendar.getInstance().getTime();
		String cDate = df.format(today);
		return cDate;
	}


	
	public int emptySlots() {
		for (int i = 0; i <parkingLot.length; i++) {
			if (parkingLot[i].equals(i+1 + " Free Spot")) {
				count++;
			}
		}
		System.out.println("There are " + count + " free slots");
		return count;
	}

	public int freePlace() {
		for (int i = 0; i < parkingLot.length; i++) {
			if (parkingLot[i].contains("Free Spot")) {
				fp = i;
				break;
			}
		}
		return fp;
	}
	public String carIn(Vehicle s) {
		for (int i = 0; i <parkingLot.length; i++) {
			if (parkingLot[i].equals(i+1 + " Free Spot")) {
			veh.add(fp,s);
			parkingLot[fp] = fp+1 + " Taken";
			s.setMillisStart(System.currentTimeMillis());
			s.setCheckInTime(currentTime());
			s.setCheckInDate(currentDate());
			return "License Number : " + s.getLicenseNumber() + "\nBrand : " + s.getBrand() + "\nModel : "
			+ s.getModel() + "\nColour : " + s.getColour() + "\nDate: " + currentDate() + "\nTime : "
			+ currentTime() + " Parked in slot number : " + freePlace();
		}
	}
		return "No free slots available";

	}

	public String carOut(Vehicle c) {
		for (int i = 0; i < parkingLot.length; i++) {
			if (c.getLicenseNumber().equals(veh.get(i).getLicenseNumber())) {
				c.setMilliEnd(System.currentTimeMillis());
				c.setCheckOutTime(currentTime());
				c.setCheckOutDate(currentDate());
				parkingLot[i]=i+1 + " Free Spot";
				return "License Number : " + c.getLicenseNumber() + "\nBrand : " + c.getBrand() + "\nModel : " + c.getModel()
				+ "\nColour : " + c.getColour() + "\n\nEntry Time: " + c.getCheckInTime() + "\n\nEntry Date : "
				+ c.getCheckInDate() + "\n\nExit Time : " + currentTime() + "\nExit Date: " + currentDate();
			}
		}
		return "Car not found";
	}

	public int findCar(Vehicle s) {
		for (int i = 0; i < parkingLot.length; i++) {
				if (s.getLicenseNumber().equals(parkingLot[i])) {
					return i;
			}
		}
		return -1;
	}
	
	public void pay(Vehicle c) {
		long totalMillis = (c.getMilliEnd()-c.getMillisStart());
		double totalHours = TimeUnit.MILLISECONDS.toHours(totalMillis);
		System.out.println("Total amount: " + totalHours*2 + "€");
	}
}