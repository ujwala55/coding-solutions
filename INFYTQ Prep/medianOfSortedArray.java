import java.util.*;
import java.lang.*;
import java.io.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      int m=s.nextInt();
      int n=s.nextInt();
      int[][] a=new int[m][n];
      int[] b=new int[m*n];
      for(int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++)
          {
              a[i][j]=s.nextInt();
          }
      }
    int k=0;
      for(int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++)
          {
            b[k] =a[i][j]; 
            k++;
          }
      }
      Arrays.sort(b);
      int median;
      int len=m*n;
      if(len%2==0)
      {
          median =(b[len/2]+b[len/2+1])/2;
          System.out.println(median);
      }
      else
      {
          median=b[len/2];
          System.out.println(median);
      }
    }
}
