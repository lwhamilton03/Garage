
public class Car extends Vehicle {
	
	private int doors;
	
	public Car(int noWheels, String colour, String model, int doors)
	{
		super(noWheels, colour, model);
		this.doors = doors;
	}
	
	public int getDoors()
	{
		return doors;
	}
	
}
