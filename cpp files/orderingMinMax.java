import java.util.*;

public class ordering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	arr[i]=s.nextInt();
    }
    for(int i=0;i<n;i=i+2)
    {
    	for(int j=0;j<n;j++)
    	{
    	if(arr[j]>0)
    	{
    		a[i]=arr[j];
    		arr[j]=0;
    		break;
    	}
    }
    }
    for(int i=1;i<n;i=i+2)
    {
    	for(int j=0;j<n;j++)
    	{
    	if(arr[j]<0)
    	{
    		a[i]=arr[j];
    		arr[j]=0;
    		break;
    	}
    	}
    }
    for(int i=0;i<n;i++)
    {
    	System.out.print(a[i]+" ");
    }
	}

}
