import java.util.*;

public class zeroMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c;j++)
        		
        	{
        		arr[i][j]=s.nextInt();
        	}
        }
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c;j++)
        	{
        	   if(arr[i][j]==0) {
        		  for(int m=0;m<c;m++)
        		  {
        			  arr[i][m]=-1;
        			  arr[m][j]=-1;
        		  }
        	   }
        	}
        }
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c;j++)
        	{
        		if(arr[i][j]==-1)
        		{
        			arr[i][j]=0;
        		}
        	}
        }
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c;j++)
        	{
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
}
}
