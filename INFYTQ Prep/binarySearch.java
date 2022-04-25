//iterative approach
import java.util.*;
public class MyClass {
    public static int binarySearch(int arr[],int n,int k)
    {
        int low=1;
        int high=n;
        int mid;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==k)
            return mid;
            else if(arr[mid]>k)
            high=mid-1;
            else
            low=mid+1;
        }
        return 0;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      int k=sc.nextInt();
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }
      int result;
      result=binarySearch(arr,n,k);
      System.out.print(result);
    }
}
