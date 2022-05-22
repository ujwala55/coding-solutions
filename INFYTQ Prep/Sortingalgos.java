//Bubble sort

import java.util.*;
class Main {
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
          arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		printArray(arr);
	}
}
//selection sort

import java.util.*;
class Main {
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
          arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			int smallest=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[smallest]>arr[j])
				{
					smallest=j;
				}
			}
			    int temp=arr[smallest];
				arr[smallest]=arr[i];
				arr[i]=temp;
		}
		printArray(arr);
	}
}
