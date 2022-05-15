package Bikes;

import java.util.Scanner;

public class BikeMain {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name:");
		String m=s.nextLine();
		System.out.println("Enter License number:");
		String n=s.nextLine();
		Rider r=new Rider();
		Bike b=new BikeManufacturer().getBike();
		if(b!=null)
		{
			r.ride(b, m, n);
			Engine e=new Engine();
			Wheel w=new Wheel();
		}
		else
		{
			System.out.println("Bike is not available");
		}
	}

}
