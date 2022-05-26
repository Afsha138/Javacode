import java.util.Scanner;
public class LinearSearch 
	{
	 public static int search(int a[], int x)
	    {
	        int n = a.length;
	        for (int i=0;i<n;i++)
	        {
	            if (a[i]==x)
	            {
	                return i+1;
	            }
	        }
	        return 0;
	    }
	    public static void main(String args[])
	    {
	    	Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of elements:");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter elements in array:");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("Enter element to search:");
	        int x = sc.nextInt();
	        sc.close();
	        int result = search(a,x);
	        if (result==0)
	        {
	            System.out.print("Element doesn't exist ");
	        }
	        else
	        {
	            System.out.print("Element found at location "+result);
	        }
	    }
	}
