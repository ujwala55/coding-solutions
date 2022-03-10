//find if the sum of a subarray is 0 or not

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	a[i]=s.nextInt();
	    }
	    int sum,count=0;
	    for(int i=0;i<n;i++)
	    {
	    	sum=0;
	    	for(int j=i;j<n;j++)
	    	{
	    		if(a[i] !=0 || a[j]!=0)
	    		{
	    		for(int k=i;k<=j;k++)
	    		{
	    		sum=sum+a[k];
	    		if(sum==0)
	    	    count++;
	    		}
	    		}
	    	}
	    }
	    	if(count>0)
	    	System.out.println("yes");
	    	else
	    	System.out.println("no");
	}
}
