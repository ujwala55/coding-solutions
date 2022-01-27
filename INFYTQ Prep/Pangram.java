/*A string is a pangram if it contains all letters from a to z*/

import java.util.*;

public class pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner s=new Scanner(System.in);
  String str=s.nextLine();
  HashMap<Character,Integer>m=new HashMap();
  int count;
  for(char c='a';c<'z';c++)
  {
	  m.put(c,0);
  }
  for(int i=0;i<str.length();i++)
  {
	  char c=str.charAt(i);
	  if(m.containsKey(c))
	  {
		  count=m.get(c);
		  count++;
		  m.put(c,count);
	  }
   }
       int flag=0;
  for(Character key:m.keySet())
  {
	  if(m.containsValue(0))
	  {
		  flag=1;
	  }
  }
  if(flag==1)
  {
	  System.out.println("not a pangram");
  }
  else { System.out.println("pangram");}
 }
}
