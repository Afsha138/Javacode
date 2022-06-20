import java.util.Scanner;

public class RoofTopPoolCafeFactory 
{
	Scanner sc = new Scanner(System.in);
	RoofTopPoolCafeFactory getRooftopPoolCafe()
	{
		System.out.println("Which cafe you want to visit :");
		String cafe=sc.nextLine();
		
		if(cafe.equalsIgnoreCase("Afsha"))
		{
			System.out.println("Welcome to Afsha cafe");
			return RoofTopPoolCafeFactory();
		}
		else
		{
			System.out.println("Welcome to Kasturi cafe");
			return RoofTopPoolCafeFactory();
		}
	}
	private RoofTopPoolCafeFactory RoofTopPoolCafeFactory()
	{
		return null;
	}
	
}