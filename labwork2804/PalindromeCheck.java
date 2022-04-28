import java.util.Scanner;
public class PalindromeCheck
{

	public static void main(String[] args) 
	{
		String s="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		s=sc.nextLine();
		int word=s.length();
		String reverse="";
		int i;
		for(i=(s.length()-1);i>=0;--i)
		{
		reverse=reverse+s.charAt(i);
		}
		if(s.equals(reverse))
		{
		System.out.println("Palindrome");
		}
		else
		{
		System.out.println("Not a Palindrome");
		}
	}
}
