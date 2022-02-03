import java.util.*;

public class sticklerThief {

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
    int fsum=0;
    for(int i=0;i<n;i=i+2)
    {
    	fsum=fsum+alist.get(i);
    }
    int ssum=0;
    for(int i=1;i<n;i=i+2)
    {
    	ssum=ssum+alist.get(i);
    }
    if(fsum>ssum)
    	System.out.println(fsum);
    else
    	System.out.println(ssum);
	}

}
