package labwork;
import java.util.Scanner;

public class SearchElement
{
	public static int searchingElement(int[] arr, int search_ele)
	{    
        for(int i=0;i<arr.length;i++)
        {    
            if(arr[i] ==search_ele)
            {    
                return i;    
            }    
        }    
	 
	        return -1;    
	}
	
    public static void main(String[] args) 
    {
	
    	int i,n,num,search_ele,array[];
		
    	SearchElement a=new SearchElement();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of elements in array:");
		 num=in.nextInt();
		array=new int[num];
		System.out.println("Enter all the  elements :  ");
        for( i=0;i<num ; i++)
	       {
	    	   array[i]=in.nextInt();
	       }
        System.out.println("Enter the element you want to search in an array :  ");   
	       search_ele=in.nextInt();
	      
	     for(i=0;i<num;i++)
	       {
	    	   if(array[i] == search_ele)
	    	   {
	    		   System.out.println(search_ele+" is found at index: "+searchingElement(array, search_ele));
	    		   break;
	    	   }
	       }
	        if(i==num)
	        {
		      System.out.println(search_ele+" not found ...");
          	}
    } 
} 
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

