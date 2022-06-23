package areaOfRectangle;
import java.util.Scanner;
public class Rectangle_Main {

	public static void main(String[] args) 
	{
		callRectangle();
	}

	private static void callRectangle() 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length : ");
		int length = sc.nextInt();
		System.out.println("Enter breadth : ");
		int breadth = sc.nextInt();
		Rectangle r1 = new Rectangle(length, breadth);
		System.out.println(r1);
	}

}


