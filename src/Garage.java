// imported this so that we can use ArrayList
import java.util.ArrayList;

//this is a seperate class Garage and is not related to the others, this is where we will be using Getters in order to access the private variables 
public class Garage {

	// using this template "ArrayList <Object> nameOfArrayThatYouHaveCreated = new ArrayList <Object>();" the Object is the object eg the class so Vehicle and then we set a new ... that is emptyvia the ()
	// This array will contain all the objects(Vehicles) in, and this will represent the list of objects(Vehicles) in the garage
	ArrayList <Vehicle> arrayVehicles = new ArrayList <Vehicle>();
	ArrayList <Vehicle> arrayCar = new ArrayList <Vehicle>();
	
	
	// a method that allows us to add the different objects to the arrayName
	// "arrayName.add()" this will add whatever is in the brackets to arrayName
	// inside the brackets () we have "new CLASSNAME (all the variables that want to insert into it)
	public void enterGarage()
	{
		arrayVehicles.add(new Car (4, "Red", "Toyota", 3));
		arrayVehicles.add(new Car (4, "Silver", "Ferrari", 2));
		arrayVehicles.add(new Van (4, "White", "Fiat", "12ft"));
		arrayVehicles.add(new MotorBike (4, "Green", "Harley", true));
		
		arrayCar.add(new Car (4, "Red", "Toyota", 3));
		arrayCar.add(new Car (4, "Silver", "Ferrari", 2));
	}
	
	// creating a method that is void so it does not return anything, so we use System.out.println(); for it to print out 
	// this method is in order to be able to 
	// new variables that will be needed to input in the main and then will be used
	public void fixVehicle(int priceCar, int priceVan, int priceMotorBike)
	{
		//these are variables that will be used within this method, they are integers and are set to 0 
		int carPrice = 0;
		int vanPrice = 0;
		int motorBikePrice = 0; 
		
		// creating a for each loop, so that it checks every index of the array
		// for(CLASSNAME arbitraryName: arrayName) so this is the format for the for each loop. It has the ClassName then an name : in the array arrayName
		for(Vehicle eachVehicle : arrayVehicles)
		{	
			// "instanceof" checks if it is in the Class "Car"
			// eachVehicle is just an arbitrary name, and as it is from the for loop, it will take the object that it represents
			//and then the instanceof will be applied and if it is " an instanceof ClassType then it will do whatever is in the body of the if {} 
			
			if (eachVehicle instanceof Car)
			{
				//when you want to add something to a variable, you need to have the variable = variable + whatever you want to add, as of the "=" is an assignment operator 
				//(so if it was just variable = whatever you want to add, actually you are just setting the variable to the thing that you want to add)
				carPrice = carPrice + priceCar;
			}
			if (eachVehicle instanceof Van)
			{
				vanPrice = vanPrice + priceVan;
			}
			if (eachVehicle instanceof MotorBike)
			{
				motorBikePrice = motorBikePrice + priceMotorBike;
			}
		} 
		// as this method is void we want it to actually System.out.println(); so that it outputs it 
		System.out.println("Car Fix Price: £" + carPrice);
		System.out.println("Van Fix Price £ " + vanPrice);
		System.out.println("Motor Bike Fix Price £ " + motorBikePrice);
		
		//inside we have Brackets around the carPrice + ... because we want it to output one total integer rather than the sum of 3 integers 
		System.out.println("Total Fix Price £ " + (carPrice + vanPrice + motorBikePrice));
		
	}
	
	// creating another method which will remove the object from the garage (which is the arrayVehicles - which is a list of all the objects (Vehicles)  
	public String exitGarage(String type)
	{
		
		// for loop
		// as we are removing from an array we will go through from the end and get to the starting index so
		// intialising: we are assigning i to be the size of the array and -1 as of the way indexing works as that includes 0
		// Exit Condition: as long as i>= 0 keep checking in the loop. Update Condition: reduce 1 from i after you have checked that specific index
		
		for(int i = arrayVehicles.size() -1; i >= 0; i--)
		{
		
			// we have set the variable in the parameter to be "type" so here we are saying if the type is equal to "String" so Car then go to the body {}
			if (type == "Car")
			{
				
				//arrayName.get(i) - this will go through the array and it will get that object at the index i
				//instanceof - this is seeing if the arrayVehicles at index i of the array will be of type Car (class Car) 
				
				if(arrayVehicles.get(i) instanceof Car)
				{
					
					// as in an if statement then if it is of type Car then the ".remove()" will remove (in the brackets) from the array
					// I believe this is why we go through from the right end such that we are able to remove at an index without having an 'computational error'. 
					arrayVehicles.remove(i); 
				}
			}
			else if(type == "Van")
			{
				if(arrayVehicles.get(i) instanceof Van)
				{
					arrayVehicles.remove(i);
				}
					
			}
			else if(type == "MotorBike")
			{
				if(arrayVehicles.get(i) instanceof MotorBike)
				{
					arrayVehicles.remove(i);
				}
			}

		}
		
		return "exit"; 
	
	}
	
	// Creating a new model to just print out all the vehicles in the Garage (eg arrayVehicles) 
	// going through the array arrayVehicles and selecting each object in the array and then use sysout to print out 
	//.getModel() -- this is a GETTER that I created in the class vehicle as I want to be able to find the variable 'model' of every object that is in the class Vehicle (call it from Vehicle)
	public void printGarage()
	{
		for (Vehicle eachVehicle: arrayVehicles)
		{
			System.out.println(eachVehicle.getModel());
		}
	}
	
	
	// This is a method to remove an entry from an array using its index position, using the ".remove(i)" 
	public String exitIdGarage(int i)
	{
		arrayVehicles.remove(i);
		return "Exit Garage is a go go";
	}

	// This is a method that I've created to add a new Vehicle into the array arrayVehicles 
	// when calling this in the main, need to addVehicleToGee(new ClassName(all the variables you want in words)
	
	public String addVehicleToGee(Vehicle newVehicle)
	{
		arrayVehicles.add(newVehicle);
		return "Welcome to GeeGeeGarage";
		
	}
	
	// method to completely remove all the enteries in the array. use the ".removeALL", such that
	public String emptyGarage()
	{
		arrayVehicles.removeAll(arrayVehicles);
		return "GeeGees Garage is empty and closed for Business";
	}
	
	
}
