package sorting;
import java.util.Arrays;
import java.util.Scanner;
public class Student_main
{

public static void main(String[] args)
{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	@SuppressWarnings("resource")
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter the number of Students data you want to insert:");
	int n=sc.nextInt();
	Student[] obj=new Student[n];
	for(int i=0;i<n;i++) 
	{
		System.out.println("Enter Roll no:");
		int roll=sc.nextInt();
		System.out.println("Enter Name:");
		String name=Sc.nextLine();
		System.out.println("Enter Subject:");
		String subject=Sc.nextLine();
		System.out.println("Enter total Marks");
		int marks=sc.nextInt();
		obj[i]=new Student(name,roll,subject,marks);
	}
	Arrays.sort(obj, new Name_Comparator());
	for(Student x:obj)
	{
		System.out.println(x+" ");
	}
	
	
}
}