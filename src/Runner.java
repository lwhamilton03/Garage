
public class Runner {

	// Main line, needs to be put in the main class of every project 
	public static void main(String [] args) 
	{
		
		Garage garagePark = new Garage(); 
		garagePark.enterGarage();
		
		garagePark.printGarage();
		System.out.println(garagePark.exitGarage("Car"));
		System.out.println("   ");
		garagePark.printGarage();
		
		garagePark.addVehicleToGee(new Car(3, "Purple", "Reliant", 3));
		garagePark.addVehicleToGee(new Van(4, "Blue", "Lutton", "11.4ft")); 
		garagePark.addVehicleToGee(new MotorBike(2, "Red", "Yamaha", false));
		
		garagePark.printGarage();
		
		// System.out.println(garagePark.emptyGarage());
		
		garagePark.fixVehicle(230,  450, 22);
		
		
		
	}
}
