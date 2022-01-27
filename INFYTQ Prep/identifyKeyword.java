//TCS prev question
import java.util.*;

public class identifyKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
       String[] s={"else","if","case","continue","for","break","Defer","Struct","Goto","Map","Range","Return","Type","Var","Func","Default"};
       int flag=0;
      for(int i=0;i<s.length;i++)
      { 
       if(str.equals(s[i]))   
       {
    	 flag=1;
    	 break;
       }
      }
      if(flag==1)
      {
    	  System.out.println(str+" "+"is a keyword");
      }
      else
      {
    	  System.out.println(str+" "+"is not a keyword");
      }
  }
}
