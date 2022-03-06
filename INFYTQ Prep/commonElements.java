//common elements in 3 arrays
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Ideone ob=new Ideone();
		Scanner s=new Scanner(System.in);
	    int a[] = {1, 5, 10, 20, 40, 80};
        int b[] = {6, 7, 20, 80, 100};
        int c[] = {3, 4, 15, 20, 30, 70, 80, 120};
	    	ob.findCommon(a,b,c);
	}

		 void findCommon(int a[], int b[], int c[])
       {
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length && k<c.length)
		{
					if(a[i]==b[j] && b[j]==c[k])
					{
					 //v.add(a[i]);
					   System.out.println(a[i]);
					   i++; j++; k++;
					}
					 else if (a[i] < b[j])
                       i++;
                     else if (b[j] < c[k])
                       j++;
                     else
                       k++;
		}
	}
}
