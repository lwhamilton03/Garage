
public class MotorBike extends Vehicle {
	
	private boolean sideCar;
	
	public MotorBike(int noWheels, String colour, String model, boolean sideCar)
	{
		
	// we use super here to ensure that the attributes from  the super class are inputted here and allowed to do so 
		super(noWheels, colour, model);
		this.sideCar = sideCar; 
	}
	
	// a boolean variable will be either "true" or "false"
	public boolean getSideCar()
	{
		return sideCar;
	}

}
