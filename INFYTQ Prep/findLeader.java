import java.util.*;

public class findLeader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++)
    {
    	arr[i]=s.nextInt();
    }
    int flag=0;
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=i+1;j<n;j++)
    	{
    		if(arr[i]>arr[j]) 
    			flag=1;
    		else {
    			flag=0;
    			break;
    		}
    	}
    	if(flag==1)
    	{
    		System.out.print(arr[i]+" ");
    	}
    }
  }
}
