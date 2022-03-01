import java.util.*;

public class arrRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    int temp[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	a[i]=s.nextInt();
    }
    temp[0]=a[n-1];
    for(int i=0;i<n-1;i++)
    {
    	temp[i+1]=a[i];
    }
    for(int i=0;i<n;i++)
    {
    	System.out.print(temp[i]+" ");
    }
	}

}
