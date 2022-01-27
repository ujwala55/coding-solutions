//infosys prev question
import java.util.*;
import java.lang.*;
import java.io.*;

public class Test {
	
		public int checkPal(int n){
			int a=n,rev=0;
			while(n>0)
			{
				int rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
		   int sum=a+rev;
			if(a==rev && a>10)
			{
				return rev;
			}
			if(a<5)
			{
				return sum;
			}
			return checkPal(sum);
		}
		public static void main (String[] args) 
		{
			// your code goes here
			Test d=new Test();
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
		System.out.println(d.checkPal(n));
		}
	}
