import java.util.*;
import java.lang.*;
import java.io.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      int r=s.nextInt();
      int c=s.nextInt();
      int[][] a=new int[r][c];
      int[] b=new int[r*c];
      for(int i=0;i<r;i++)
      {
          for(int j=0;j<c;j++)
          {
              a[i][j]=s.nextInt();
          }
      }
      int k=0;
      for(int i=0;i<r;i++)
      {
          for(int j=0;j<c;j++)
          {
             b[k]=a[i][j];
             k++;
          }
      }
      Arrays.sort(b);
      int m=0;
      for(int i=0;i<r;i++)
      {
          for(int j=0;j<c;j++)
          {
             a[i][j]=b[m];
             m++;
          }
      }
      for(int i=0;i<r;i++)
      {
          for(int j=0;j<c;j++)
          {
             System.out.print(a[i][j]+" ");
          }
          System.out.println();
      }
    }
}
