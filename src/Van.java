
public class Van extends Vehicle{

	private String height;
	
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

