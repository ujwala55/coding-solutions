import java.util.*;

public class selectiveArrangements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    System.out.println(selectiveArrangements(n));
	}

	private static int selectiveArrangements(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		
		return (n-1)*(selectiveArrangements(n-1)+selectiveArrangements(n-2));
	}

}
