package Bikes;

import java.util.Scanner;

public class BikeManufacturer{
	Bike getBike()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Bike Nane:");
		String b=s.nextLine();
		if(b.equalsIgnoreCase("Scott"))
		{
			return new Scott();
		}
		else if(b.equalsIgnoreCase("RidleyBike"))
		{
			return new RidleyBike();
		}
		else
		{
			return null;
		}
	}
}
