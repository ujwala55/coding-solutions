import java.util.*;

public class minDiffBtwHeights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int k=s.nextInt();
    int n=s.nextInt();
    int a[]=new int[n];
    int temp[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	a[i]=s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
    	if(a[i]>k)
    	{
    		temp[i]=a[i]-k;
    	}
    	else if(a[i]<=k)
    	{
    		temp[i]=a[i]+k;
    	}
    }
    for(int i=0;i<n;i++)
    {
    	System.out.print(temp[i]+" ");
    }
	}

}
