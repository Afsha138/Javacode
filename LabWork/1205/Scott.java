package Bikes;

public class Scott extends Bike
{
	@Override
	void start()
	{
		System.out.println(" Scott Starts");
	}@Override
	void move()
	{
		System.out.println("Scott Moves");
	}@Override
	void stop()
	{
		System.out.println("Scott Stops");
	}
}