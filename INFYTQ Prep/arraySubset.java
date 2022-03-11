//check if an array is subset of other set

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
		int m=s.nextInt();
		int a1[]=new int[n];
		int a2[]=new int[m];
		for(int i=0;i<n;i++)
		{
			a1[i]=s.nextInt();
		}
		for(int j=0;j<m;j++)
		{
			a2[j]=s.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(a1[i]==a2[j])
				count++;
			}
		}
		if(count==m)
		     System.out.print("yes");
		 else
		     System.out.print("No");
	}
}
