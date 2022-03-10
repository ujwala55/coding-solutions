//maxproduct subArray

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
		int max=a[0],prod;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				prod=1;
				if(a[i]!=0 || a[j]!=0)
				{
				for(int k=i;k<j;k++)
				{
					prod=prod*a[k];
					if(prod>max)
					max=prod;
				}
				}
			}
		}
		System.out.println(max);
	}
}
