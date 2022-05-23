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
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{                                                                //input :abc (substrings)
			                                                         //output: a ac abc b bc c
			for(int j=i+1;j<=s.length();j++)
			{
                System.out.println(s.substring(i,j));
			}
		}
	}
}

import java.util.*;
class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
                // System.out.println(s.substring(i,j));
				for(int k=i;k<j;k++)
				{
					System.out.print(ch[k]);
				}
				System.out.println();
			}
			
		}
	}
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
class Main {
	public static void printSubsequences(String str,String ans)
	{
		if(str.length() == 0)
		{
			System.out.println(ans);
			return ;
		}
		char ch=str.charAt(0);
		String res=str.substring(1);
		printSubsequences(res,ans + ch);
		printSubsequences(res,ans + "");                          //power set (sub sequences)
		
	}
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		printSubsequences(str," ");
	}
}
