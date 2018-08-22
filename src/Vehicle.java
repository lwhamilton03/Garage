
public class Vehicle {

	private int noWheels;
	private String colour; 
	private String model; 
	
	public Vehicle(int noWheels, String colour, String model)
	{
		this.noWheels = noWheels; 
		this.colour = colour; 
		this.model = model; 
	}
	
	public int getNoWheels()
	{
		return noWheels;
	}
	
	public String getColour() 
	{
		return colour;
	}
	public String getModel() 
	{
		return model;
	}

}

