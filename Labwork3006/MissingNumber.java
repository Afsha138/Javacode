package labwork;
import java.util.Scanner;
public class MissingNumber
{
	 static int missingNumber(int array[],int n)
	{
		int temp=0;
		int sum=0;
		for(int i=0; i<n-1; i++)
		{
			sum=sum+array[i];
		}
		temp=n*(n+1)/2;
		return (temp-sum);
		
	}
	

	public static void main(String[] args)
	{
		MissingNumber a=new MissingNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in array:");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elements in array:");
		for(int i=0;i<n-1;i++)
		{
			array[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Missing element in array:  "+a.missingNumber(array,n));
	}

}
