import java.util.*;

public class maxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	a[i]=s.nextInt();
    }
    int maxSum=a[0];
    int sum=0;
    for(int i=0;i<n;i++)
    {
    	sum=sum+a[i];
    	if(sum>maxSum)
    	{
    		maxSum=sum;
    	}
    }
    System.out.println(maxSum);
	}

}
