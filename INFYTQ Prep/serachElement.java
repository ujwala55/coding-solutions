import java.util.*;
import java.lang.*;
import java.io.*;
public class MyClass {
    public static void main(String args[]) {
     Scanner s=new Scanner(System.in);
     int m=s.nextInt();
     int n=s.nextInt();
     int[][] a=new int[m][n];
     for(int i=0;i<m;i++)
     {
         for(int j=0;j<n;j++)
         {
             a[i][j]=s.nextInt();
         }
     }
     int target=s.nextInt();
     int flag=0;
     for(int i=0;i<m;i++)
     {
         for(int j=0;j<n;j++)
         {
             if(a[i][j]==target)
             flag=1;
         }
     }
     if(flag==1)
     {
         System.out.println("true");
     }
     else
         System.out.println("false");
    }
}
