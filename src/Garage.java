import java.util.ArrayList;

public class Garage {

	ArrayList <Vehicle> arrayVehicles = new ArrayList <Vehicle>();
	
	public void enterGarage()
	{
		arrayVehicles.add(new Car (4, "Red", "Toyota", 3));
		arrayVehicles.add(new Car (4, "Silver", "Ferrari", 2));
		arrayVehicles.add(new Van (4, "White", "Fiat", "12ft"));
		arrayVehicles.add(new MotorBike (4, "Green", "Harley", true));
	}
	
	public void fixVehicle(int priceCar, int priceVan, int priceMotorBike)
	{
		int carPrice = 0;
		int vanPrice = 0;
		int motorBikePrice = 0; 
		
		for(Vehicle eachVehicle : arrayVehicles)
		{	
			if (eachVehicle instanceof Car)
			{
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
		System.out.println("Car Fix Price: £" + carPrice);
		System.out.println("Van Fix Price £ " + vanPrice);
		System.out.println("Motor Bike Fix Price £ " + motorBikePrice);
		System.out.println("Total Fix Price £ " + (carPrice + vanPrice + motorBikePrice));
		
	}
	
	
	public String exitGarage(String type)
	{
		for(int i = arrayVehicles.size() -1; i >= 0; i--)
		{
			
			if (type == "Car")
			{
				
				if(arrayVehicles.get(i) instanceof Car)
				{
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
	
	public void printGarage()
	{
		for (Vehicle eachVehicle: arrayVehicles)
		{
			System.out.println(eachVehicle.getModel());
		}
	}
	
	public String exitIdGarage(int i)
	{
		arrayVehicles.remove(i);
		return "Exit Garage is a go go";
	}

	public String addVehicleToGee(Vehicle newVehicle)
	{
		arrayVehicles.add(newVehicle);
		return "Welcome to GeeGeeGarage";
		
	}
	
	public String emptyGarage()
	{
		arrayVehicles.removeAll(arrayVehicles);
		return "GeeGees Garage is empty and closed for Business";
	}
	
	
}
