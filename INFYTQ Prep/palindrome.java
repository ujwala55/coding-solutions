//Wipro prev question
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int temp=n;
    if(n<0) {
    	System.out.println("invalid");
    }
    else
    {
    int res=checkPal(n);
    if(res==temp) 
    {
    	System.out.println("Palindrome");
    }
    else
    {
    	System.out.println("Not a Palindrome");
    }
    }
	}

	private static int checkPal(int n) {
		// TODO Auto-generated method stub
		int rev=0,rem;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}

}
