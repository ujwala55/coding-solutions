import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
     {
    	 a[i]=sc.nextInt();
     }
     bubbleSort(a,n);
     for(int i=0;i<n;i++) {
    	 System.out.print(a[i]+" ");
     }
	}

	private static void bubbleSort(int[] a, int n) {
		// TODO Auto-generated method stub
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
}
