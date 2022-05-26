import java.util.Scanner;

public class ReverseArray
{
   public static void main(String[] args)
   {
     Scanner s= new Scanner(System.in);
     System.out.println("Enter the number of Elements in Array: ");
     int n=s.nextInt();
     int[] arr = new int[n];
      
      System.out.println("Enter Elements in Array: ");
      for(int i=0; i<n; i++)
         arr[i] = s.nextInt();
      System.out.println("Reverse of Given Array: ");
      for(int i=(n-1); i>=0; i--)
         System.out.println(arr[i]+ " ");
   }
}