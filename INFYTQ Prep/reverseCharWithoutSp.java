import java.util.*;


public class reverseCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    ArrayList<Character> alist=new ArrayList<Character>();
    int temp = 0;
    char ch = 0 ;
    int c = 0;
    for(int i=0;i<str.length();i++)
    {
    	alist.add(str.charAt(i));
    	if(str.charAt(i)>=58 && str.charAt(i)<=64)
    	{
    		temp=i;
    		c=i;
    		ch=str.charAt(i);
    	}
    }
    alist.remove(c);
    Collections.reverse(alist);
    alist.add(temp,ch);   
    for(int i=0;i<str.length();i++)	
    {
    	System.out.print(alist.get(i));
    }
	}
}
