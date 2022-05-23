import java.util.*;
class Main {
	public static void printArray(String str[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(str[i]+" ");
		}
	}
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);	
		String str[] = new String[3];
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0 ; i<str.length ; i++)
		{
			str[i]=sc.nextLine();
      str[i]= str[i].replaceAll("[aeiou]","");
		}	
		printArray(str,n);	
	}
}
