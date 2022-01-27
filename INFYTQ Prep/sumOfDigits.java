//TCS prev question
import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     System.out.println(sumOfDigits(n));
	}

	private static int sumOfDigits(int n) {
		// TODO Auto-generated method stub
		int sum=0,rem;
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}

}
