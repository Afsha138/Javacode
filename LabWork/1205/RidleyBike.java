package Bikes;

public class RidleyBike extends Bike
{
	@Override
	void start()
	{
		System.out.println("RidleyBike Starts");
	}@Override
	void move()
	{
		System.out.println("RidleyBike Moves");
	}@Override
	void stop()
	{
		System.out.println("RidleyBike Stops");
	}
}