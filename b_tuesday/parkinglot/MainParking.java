package parkinglot;

import java.util.Scanner;

public class MainParking {


	Parking p =Parking.getInstance();
	static Employee e = new Employee("Giorgos");
	static Car c1 = new Car ("1234","2","3","4");



	public static void showMenu() {
		String vehicleChoice;
		boolean choice=true;
		do {
			System.out.println("Please choose what you would like to do");
			System.out.println("1 for Check In\n2 for Check Out\n3 for Show Availability\n4 for Exit");
			Scanner scanner=new Scanner(System.in);
			 String input=scanner.next();
			while(!input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("4") ) { 
				System.out.println("Please enter a valid choice");
				System.out.println("1 for Check In\n2 for Check Out\n3 Show Availability\n4 Exit");
				input=scanner.next();
			}


			if(input.equals("1")) {
do {
				System.out.println("New Vehicle Entry");
				System.out.println("Vehicle Type:\n1. Car\n2. Bike");
				vehicleChoice = scanner.next();
}while(!vehicleChoice.equals("1") && !vehicleChoice.equals("2")); 
//					System.out.println("Please enter a valid choice");
//					System.out.println("1 for Car\n2 for Bike");
//					input=scanner.next();
				
				System.out.println("Licence number: ");
				String input1=scanner.next();
				System.out.println("Brand: ");
				String input2=scanner.next();
				System.out.println("Model: ");
				String input3=scanner.next();
				System.out.println("Colour: ");
				String input4=scanner.next();
				if (vehicleChoice.equals("1")) {
					Vehicle c=new Car(input1,input2,input3,input4);
					System.out.println(e.carIn(c));
				}else if(vehicleChoice.equals("2")) {
					Vehicle b =new Bike(input1,input2,input3,input4);
					System.out.println(e.carIn(b));
				}

				//				for (int i = 0; i < Parking.parkingLot.length; i++) {
				//						System.out.println(Parking.parkingLot[i]);
				//					
				//				}

				
			}else  if(input.equals("2")){
				System.out.println("Enter vehicle's licence number : ");
				String input5=scanner.next();
				for (int i = 0; i<Parking.veh.size();i++) {
//					System.out.println(Parking.parkingLot[i]);
//					System.out.println("**********");

					if(input5.equals(Parking.veh.get(i).getLicenseNumber())) {
						System.out.println(e.carOut(Parking.veh.get(i)));
						System.out.println("Proceed to payment? (Y/N)");
						input5=scanner.next();
						if (input5.equalsIgnoreCase("Y")) {
							e.pay(Parking.veh.get(i));
						}else {
						break;
						}
						break;
					}
					System.out.println("Car not found!");
				}

				
				
			}else if(input.equals("3")) {
				showParking();
				e.emptySlots();
			}else if(input.equals("4")) {
				break;
			}
			System.out.println("Do you want another action? (Y/N)");
			String input6=scanner.next();
			if (input6.equalsIgnoreCase("Y")){
				choice=true;
			}
			else {
				choice=false;
			}
		}while(choice);
	}
	
	
	public static void resetParking() {
		for (int i = 0; i <Parking.parkingLot.length; i++) {
			Parking.parkingLot[i] = i+1 + " Free Spot";
			//System.out.println(Parking.parkingLot[i]);
		}
	}

	public static void showParking() {
		for (int i = 0; i <Parking.parkingLot.length; i++) {
			System.out.println(Parking.parkingLot[i]);
		}
	}


	public static void main(String[] args) {
		resetParking();
//		e.carIn(c1);
//		e.carOut(c1);
//		e.pay(c1);
		showMenu();
		//		//System.out.println(e.emptySlots());
		//		System.out.println(e.carIn(c1));
		//		//showParking();
		//		//System.out.println(e.findCar(c1));
		//		//showMenu();
		//		System.out.println(e.carOut(c1));
		//		showParking();
	}


}
