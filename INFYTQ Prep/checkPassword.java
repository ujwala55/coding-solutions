/*write a function checkPassword(str) which validates the password 
password is valid if it satisfies below conditions:
1.Atleast 4 characters in it
2.Atleast one numeric digit in it
3.Atleast one capital letter
4.Must not have space or slash
5.Starting character must not be a number.*/ //TCS prev question.

import java.util.Scanner;

public class checkPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        boolean b=checkPassword(str);
        if(b==true) {
        	System.out.println("valid Password");
        }else {
        	System.out.println("invalid Password");
        }
	}

	private static boolean checkPassword(String str) {
		// TODO Auto-generated method stub
        int count=0,flag=0;
		if(str.charAt(0)!='_' && str.charAt(0)!='/'&& str.length()>4 && Character.isDigit(str.charAt(0))==false && str.charAt(0)!=' ')
		{
			for(int j=0;j<str.length();j++) {
			     
			     if(Character.isDigit(str.charAt(j)))
			     {
			    	 count=1;
			     }
			     if(str.charAt(j)>=97 && str.charAt(j)<=122)
			     {
			    	 flag=1;
			     }
			}
		}
		if(count==1 && flag==1) {
			return true;
		}
		return false;
	}

}
