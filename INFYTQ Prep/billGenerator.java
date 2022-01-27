//infosys prev question
import java.util.Scanner;

public class generateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       System.out.println("enter number of pizzas");
       int pizza=s.nextInt();
       System.out.println("enter number of cooldrinks");
       int cooldrinks=s.nextInt();
       System.out.println("enter number of puffs");
       int puffs=s.nextInt();
       pizza=pizza*100;
       cooldrinks=cooldrinks*10;
       puffs=puffs*20;
       int totalPrice=pizza+cooldrinks+puffs;
       System.out.println("Total price: "+totalPrice);
	}
}
