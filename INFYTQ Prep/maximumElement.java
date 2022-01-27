//Accenture prev question
/*find the maximum element of the array and print the maximum element and its index*/
import java.util.*;

public class maxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++) {
    	  a[i]=s.nextInt();
      }
      Arrays.sort(a);
      System.out.print(a[n-1]+" "+"index = "+(n-1));
	}

}
