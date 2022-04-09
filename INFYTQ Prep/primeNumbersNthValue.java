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
    HashMap<Integer,Integer>m=new HashMap();
    int t=s.nextInt();
   
    int count=0;
    int flag;
    while(t!=0)
    {
         int q=s.nextInt();
    for(int k=q-1;k>=0;k--)
    {
        int L=s.nextInt();
        int R=s.nextInt();
    for(int i=2;i<=1000;i++)
    {
        
     flag=isPrime(i);
     if(flag==1)
     {
         count++;
         m.put(count,i);
     }
    }
    for(int i=L;i<=R;i++)
    {
       System.out.print(m.get(i)+" ");
    }
    System.out.println();
    }
    t--;
    }
    }
}
