import java.util.*;
	import java.lang.*;
	import java.io.*;

public class charcount {
	/* package whatever; // don't place package name! */

		public static void main (String[] args) throws java.lang.Exception
		{
			// your code goes here
			Scanner s=new Scanner(System.in);
			char str[]=s.next().toCharArray();
			int count;
			for(int i=0;i<str.length;i++)
			{ 
				count=1;
				for(int j=i+1;j<str.length;j++)
				{
					if(str[i]==str[j])
					{
						count++;
						str[j]='0';
					}
				}if(str[i]!='0')
				System.out.println(str[i]+" "+count);
			}
		}
	}
