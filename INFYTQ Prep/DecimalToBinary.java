/*write a program to convert a decimal number to binary number*///TCS prev question

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int temp[]=new int[10];
     int i=0;
     while(n>0) {
    	 temp[i]=n%2;
    	 n=n/2;
    	 i++;
     }
     for(int j=i-1;j>=0;j--)
     {
    	 System.out.print(temp[j]);
     }
  }
}
