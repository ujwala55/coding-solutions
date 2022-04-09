import java.util.*;
import java.lang.*;
import java.io.*;
public class MyClass {
    public static int isPrime(int n)
    {
        int flag=1;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            flag=0;
            break;
        }
        return flag;
    }
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    // int t=s.nextInt();
    // int n=s.nextInt();
    int L=s.nextInt();
    int R=s.nextInt();
    int count;
    int flag;
    for(int i=L+1;i<R;i++)
    {
     flag=isPrime(i);
     if(flag==1)
     {
         System.out.println(i);
     }
    }
    }
}
