package parkinglot;

import java.util.ArrayList;

public class Parking {
static String [] parkingLot=new String[50];
static ArrayList <Vehicle> veh = new  ArrayList <Vehicle>();
private static Parking instance;

public Parking() {}

public static Parking getInstance () {
	if(instance==null) {
		instance=new Parking();

			
	}
	return instance;
}

public String[] getParkingLot() {
	return parkingLot;
}

public void setParkingLot(String[] parkingLot) {
	this.parkingLot = parkingLot;
}

}
