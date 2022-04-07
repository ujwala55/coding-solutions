import java.util.*;
import java.lang.*;
import java.io.*;
public class MyClass {
    public static void main(String args[]) {
     Scanner s=new Scanner(System.in);
     int r=s.nextInt();
     int c=s.nextInt();
     int[][] a=new int[r][c];
     int[] b=new int[r];
     for(int i=0;i<r;i++)
     {
         for(int j=0;j<c;j++)
         {
             a[i][j]=s.nextInt();
         }
     }
     int count;
     for(int i=0;i<r;i++)
     {
         count=0;
         for(int j=0;j<c;j++)
         {
             if(a[i][j]==1)
             {
                 count++;
             }
         }
         b[i]=count;
     }
     Arrays.sort(b);
        System.out.println(b[r-1]+" ");
    }
}
