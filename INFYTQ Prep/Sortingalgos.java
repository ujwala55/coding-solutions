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
//insertion sort

import java.util.*;
class Main {
	public static void printArray(int[] arr,int n)
	{
		for(int i=0 ; i<n ; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<arr.length;i++)
		{
			int current=arr[i];
			int j=i-1;
			while(j>=0 && current<arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		int n = arr.length;
		printArray(arr,n);
	}
}

//Quick sort

import java.util.*;
class Main {
	public static void swap(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void quickSort(int[] arr,int low,int high)
	{
		if(low < high)
		{
			int pivot=partition(arr , low , high);
			quickSort(arr , low , pivot-1);
			quickSort(arr , pivot+1 , high);
		}
	}
	public static int partition(int[] arr,int low,int high)
	{
		int pivot=arr[low];
		int i=low;
		int j=high;
		while(i < j)
		{
			while(arr[i] <= pivot && i<=high-1) i++;
			while(arr[j] > pivot && j>=low) j--;
			if(i<j)
			{
				swap(arr,i,j);
			}
		}
		swap(arr,j,low);
		return j;
	}
	
	public static void printArray(int[] arr,int n)
	{
		for(int i=0 ; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
        int n = arr.length;
		quickSort(arr , 0 , n-1);
		printArray(arr,n);
	}
}
//merge sort

import java.util.*;
class Main {
	public static void merge(int[] arr,int left,int middle,int right)
	{
		int temp[]=new int[right-left+1];
		int i=left;
		int j=middle+1;
		int k=0;
		while(i<=middle && j<=right)
		{
			if(arr[i]<arr[j])
			{
				temp[k++]=arr[i++];
			}
			else
			{
				temp[k++]=arr[j++];
			}
		}
		while(i<=middle)
		{
			temp[k++]=arr[i++];
		}
		while(j<=right)
		{
			temp[k++]=arr[j++];
		}
		for(i=left;i<=right;i++)
		{
			arr[i]=temp[i-left];
		}
	}
	public static void mergeSort(int[] arr,int left,int right)
	{
		
		if(left < right)
		{
			int middle=(left+right)/2;
			mergeSort(arr,left,middle);
			mergeSort(arr,middle+1,right);
			merge(arr,left,middle,right);
		}
	}
	public static void printArray(int[] arr,int n)
	{
		for(int i=0 ; i<n ; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	    mergeSort(arr, 0, arr.length - 1);
		printArray(arr,arr.length);
	}
}
