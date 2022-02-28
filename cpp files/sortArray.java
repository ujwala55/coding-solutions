// Given an array which consists of only 0,1,2.sort without using any sorting algorithm

import java.util.*;

public class sortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	a[i]=s.nextInt();
    }
    int temp;
    for(int i=0;i<n;i++)
    {
    	for(int j=0;j<i+1;j++)
    	{
    		if(a[i]<a[j])
    		{
    			temp=a[j];
    			a[j]=a[i];
    			a[i]=temp;
    		}
    	}
    }
    for(int i=0;i<n;i++)
    {
    	System.out.print(a[i]+" ");
    }
	}

}
