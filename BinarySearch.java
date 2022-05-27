import java.util.Arrays;
public class BinarySearch
{
  static int doBinarySearch(int[]a,int elem)
  {
    int l=0;
    int r=a.length-1;
    while(r>=l)
    {
      int mid=(l+r)/2;
      if(a[mid]==elem)
      {
        return mid;
      }
      else if(a[mid]>elem)
      {
        r=mid-1;
      }  
      else
      {
        l=mid+1;
      }
    }
    return -1;
  }

  public static void main(String[] args)
    {
    int[] arr= {5,10,15,20,25,30};
    Arrays.sort(arr);
    int element=25;
    System.out.println(doBinarySearch(arr,element));
  }

}