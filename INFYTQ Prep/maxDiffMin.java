//Wipro prev question
/*write a program to return the diff btw the max and min element of an array*/
import java.util.Arrays;
import java.util.Scanner;

public class maxDiffMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    System.out.println("diff is "+(a[n-1]-a[0]));
	}

}
