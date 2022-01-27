import java.math.*;
import java.util.*;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		  BigInteger f = new BigInteger("1"); 

    
      for (int i = 2; i <= n; i++) {
          f = f.multiply(BigInteger.valueOf(i));}
       System.out.println(f);
	}

}
