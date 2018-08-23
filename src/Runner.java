
public class Runner {

	// Main line, needs to be put in the main class of every project 
	public static void main(String [] args) 
	{
		
		// this is to create an instance, default constructor, so that we can refer to the Garage class in this main runner 
		Garage garagePark = new Garage(); 
		
		//calling the method enterGarage from garage class using the garagePark to call it from Garage
		garagePark.enterGarage();
		
		garagePark.printGarage();
		// have to sysout as the exitGarage method to output the return 
		
		System.out.println(garagePark.exitGarage("Van"));
		System.out.println("   ");
		garagePark.printGarage();
		
		garagePark.addVehicleToGee(new Car(3, "Purple", "Reliant", 3));
		garagePark.addVehicleToGee(new Van(4, "Blue", "Lutton", "11.4ft")); 
		garagePark.addVehicleToGee(new MotorBike(2, "Red", "Yamaha", false));
		
		garagePark.printGarage();
		
		// System.out.println(garagePark.emptyGarage());
		
		garagePark.fixVehicle(230,  450, 22);
		
		
		System.out.println("Whats in the whole Garage");
		garagePark.printGarage();
		

		
	}
}
