
public class MotorBike extends Vehicle {
	
	private boolean sideCar;
	
	public MotorBike(int noWheels, String colour, String model, boolean sideCar)
	{
		super(noWheels, colour, model);
		this.sideCar = sideCar; 
	}
	
	public boolean getSideCar()
	{
		return sideCar;
	}

}
