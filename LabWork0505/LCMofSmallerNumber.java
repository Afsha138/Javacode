package labwork;
import java.util.Scanner;

public class LCMofSmallerNumber 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
	      System.out.println("Enter the Ratio: ");
	       int a=s.nextInt();
	       int b=s.nextInt();
	       int c=a*b;
	       System.out.print("Enter LCM:");
	       int LCM=s.nextInt();
	        int p=LCM/c;
	        int x=p*a;
	        int y=p*b;
	    if(x>y)
	    {
	         System.out.println("Smaller number is "+y);
	    }
	    else
	    {
	         System.out.println("Smaller number is "+x);
	    }
	  
	  }
}
	


	


