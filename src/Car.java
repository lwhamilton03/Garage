
// "extends" as it is essentially extending the Class Vehicle such that it has all its attributes and methods. 
public class Car extends Vehicle {
	
	// new variable that is private to this sub-class car 
	private int doors;
	
	// Constructor here we want to get the variables from the super class so we need the "super(.... include the variables)" then we will include all the extra attributes that only this class will have eg doors 
	public Car(int noWheels, String colour, String model, int doors)
	{
		super(noWheels, colour, model);
		this.doors = doors;
	}
	
	// Getters: to make sure we can access the attribute doors of the car from the main runner and potentially elsewhere 
	public int getDoors()
	{
		return doors;
	}
	
}
