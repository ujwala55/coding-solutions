//Tapping rain water

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
		int arr_left[]=new int[n];
		int arr_right[]=new int[n];
		int result[]=new int[n];
		int max=0,j=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				arr_left[j]=max;
				j++;
			}
			else
			{
				arr_left[j]=max;
				j++;
			}
		}
		int max2=0,k=0;
		for(int i=n-1;i>=0;i--)
		{
			if(a[i]>max2)
			{
				max2=a[i];
				arr_right[k]=max2;
				k++;
			}
			else
			{
				arr_right[k]=max2;
				k++;
			}
		}
		for(int i=0;i<n;i++)
		{
			result[i]=Math.min(arr_left[i],arr_right[i])-a[i];
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=result[i];
		}
		System.out.println(sum);
	}
}
