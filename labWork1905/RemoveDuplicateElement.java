package labwork;
import java.util.Scanner;
public class RemoveDuplicateElement
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int length=s.nextInt();
		int arr[]=new int[length];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Entered Elements In Array Are:");
		for(int i=0;i<length;i++)
		{
			System.out.println(arr[i]);
		}
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j++]=arr[length-1];
		System.out.println("Array After Removing Duplicate Elements:");
		for(int k=0;k<j;k++)
		{
			System.out.println(temp[k]);
		}
	}

	}


