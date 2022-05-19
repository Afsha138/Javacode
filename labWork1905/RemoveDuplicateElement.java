package labwork;
import java.util.Scanner;
public class RemoveDuplicateElement
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int length=s.nextInt();
		int a[]=new int[length];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<length;i++)
		{
			a[i]=s.nextInt();
		}
		int temp[]=new int[a.length];
		int j=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j]=a[i];
				j++;
			}
		}
		temp[j++]=a[length-1];
		System.out.println("Array After Removing Duplicate Elements:");
		for(int k=0;k<j;k++)
		{
			System.out.println(temp[k]);
		}
	}

	}


