import java.util.*;

public class strictlySmallLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    ArrayList<Integer>alist=new ArrayList<Integer>();
    for(int i=0;i<n;i++)
    {
    	int temp=s.nextInt();
    	alist.add(temp);
    }
    System.out.println(n-2);
	}

}
