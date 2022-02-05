import java.util.*;

public class optGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    Vector<Integer>v=new Vector<Integer>();
    for(int i=0;i<n;i++)
    {
    	a[i]=s.nextInt();
    }
    for(int i=1;i<n;i=i+2)
    {
    	v.add((a[i]*a[i]));
    }
    for(int i=0;i<2;i++)
    {
    	System.out.print(v.get(i));
    }
	}

}
