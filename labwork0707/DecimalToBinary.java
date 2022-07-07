import java.util.Scanner;
public class DecimalToBinary
{
  public static void main(String[] args)
  {
      int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Decimal Number:");
    num=sc.nextInt();
    int arr[]=new int[100];
    int i=0;
    while(num>0)
    {
      int rem=num%2;
      arr[i]=rem;
      i++;
      num=num/2;
      
    }
    System.out.print("Binary value is :");
    for(int j=i-1;j>=0;j--)
    {
      System.out.print(arr[j]);
    }
  }
}
