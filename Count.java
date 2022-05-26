import java.util.*;
public class Count
 {
   public static void main(String args[])
   { 
     String s=" ";
     Scanner sc=new Scanner (System.in);
    System.out.println("Enter a string : ");
    s=sc.nextLine();
    int count =0;
    for (int i=0;i<s.length();i++)
    {
      count=0;
      char ch=s.charAt(i);
      for (int j=0;j<s.length();j++)
      {
        char c=s.charAt(j);
        if(j<i && ch==c)
        {
          break;
        }
        if(ch==c)
        {
          count++;
          
        }
      }
      if(count!=0)
     System.out.println(ch+ " occurred " +count+
                           " times.");
      
    }
   }
 }
