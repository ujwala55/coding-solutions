//Longest consecutive subsequence

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
		Arrays.sort(a);
		int count=1;
		for(int i=0;i<n;i++)
		{
			if(i<n-1)
			{
			if(a[i+1]-a[i]==1)
			count++;
			}
		}
		System.out.print(count);
	}
}
