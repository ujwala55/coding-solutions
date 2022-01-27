//TCS prev question 
/*given an arry ,number to search , and occurance of that number find if the given number occurs given occurance number of times*/
import java.util.Scanner;

public class arrayCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     int count=sc.nextInt();
     int target=sc.nextInt();
     for(int i=0;i<n;i++)
     {
    	 a[i]=sc.nextInt();
     }
     boolean b=findCount(a,target,count);	
     if(b==true) {
    	 System.out.println("target found "+ count +" times");
     }
     else {
    	 System.out.println("-1");
     }
	}

	private static boolean findCount(int[] a, int target, int count) {
		// TODO Auto-generated method stub
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
			{
				c++;
			}
		}
		if(c==count) {
			return true;
		}
		return false;
	}

}
