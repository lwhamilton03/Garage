
// This is a sub-class of the class Vehicle (which is the super class) we do this by using the "extends" which means that the new class Van will have all the same attributes and the same methods 
// as the super class "Vehicle"

public class Van extends Vehicle{

	// Creating the variable, private so can only be accessed in the class. 
	private String height;
	
	// Creating a Constructor, because we want this to include all the attributes of the previous class before, when I say this I mean 
	public Van(int noWheels, String colour, String model, String height)
	{
		super(noWheels, colour, model);
		this.height = height; 	
		
	}
	
	public String getHeight()
	{
		return height;
	}

}

