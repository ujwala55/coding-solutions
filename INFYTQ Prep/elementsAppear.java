//find all elements that appear more than n/k times

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
		int k=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int p=n/k,count;
		for(int i=0;i<n;i++)
		{
			count=1;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]!=0 || a[j]!=0)
				{
				if(a[i]==a[j])
				{
				count++;
				a[j]=0;
				}
				}
			}
				if(count>p)
				{
					System.out.print(a[i]+" ");
				}
		}
	}
}
