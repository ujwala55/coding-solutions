//Wipro prev question
/*given an array of integers representing measurements in inches write a program to calculate the total measurement in feets ignore the measurements that are less than a foot*/
import java.util.Scanner;

public class measureInFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	a[i]=sc.nextInt();
    }
    System.out.println(measureInFeet(a,n));
    }

	private static int measureInFeet(int[] a, int n) {
		// TODO Auto-generated method stub
		int feet=0;
		for(int i=0;i<n;i++)
		{
			feet=feet+a[i]/12;
		}
		return feet;
	}

}
