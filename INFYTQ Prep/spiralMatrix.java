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
      int r1=0;
      int c1=0;
      int r2=a.length-1;
      int c2=a.length-1;
      try{
      while(true)
      {
      for(int i=r1,j=c1;i<r2;i++)
      {
          System.out.println(a[i][j]);
      }
      for(int i=r2,j=c1;j<=c2;j++)
      {
          System.out.println(a[i][j]);
      }
      
      for(int i=r2-1,j=c2;i>=r1;i--)
      {
          System.out.println(a[i][j]);
      }
      
      for(int i=r1,j=c2-1;j>r1;j--)
      {
          System.out.println(a[i][j]);
      }
      c1++;
      r2--;
      c2--;
      r1++;
      }
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("spiral matrix displayed");
    }
}
}
