import java.util.*;

public class posNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
     {
    	 a[i]=s.nextInt();
     }
     int temp;
     for(int i=0;i<n;i++)
     {
    	 for(int j=i+1;j<n;j++)
    	 {
    		 if(a[i]>0 && a[j]<0)
    		 {
    			 temp=a[i];
    			 a[i]=a[j];
    			 a[j]=temp;
    		 }
    	 }
     }
     for(int i=0;i<n;i++)
     {
    	 System.out.print(a[i]+" ");
     }
	}

}
