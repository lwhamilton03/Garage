
// I created this to be my super class
public class Vehicle {

	//this is where i am initialising my variables, I've made them private so they cant be accessed by other classes, they can only be accessed by getters and setters, these are also  created in this class and 
	// mean that the getters and setters allow for me to access the variables
	
	//Each variable will need (Accessibility, DATA TYPE, arbitrary variable name)
	private int noWheels;
	private String colour; 
	private String model; 
	
	// This is a CONSTRUCTOR, it has a capital because it has the exact same name as the Class. It does not have a return. 
	// The "this." is just ensuring that we are taking the correct variable from this. class as it has the same name as the variables that we are inputting into constructor
	
	public Vehicle(int noWheels, String colour, String model)
	{
		this.noWheels = noWheels; 
		this.colour = colour; 
		this.model = model; 
	}
	
	// Getters: it is convention to start these form of methods with "get" + NameOfMethod(). Its aim is to go and grab the correct variable from the class its made in. eg method has accessibility, data type, getName
	// return "the variable that it is";
	
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

