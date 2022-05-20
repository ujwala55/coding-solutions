//using arrays
class Main {
   int top=-1;
   int size=4;
    int arr[]=new int[size];

  public void push(int data)
  {
    if(top==size-1)
    {
      System.out.println("stack is full");
    }
    top++;
    arr[top]=data;
  }
  public void pop()
  {
    if(top==-1)
    {
      System.out.println("stack is empty");
    }
    
    int res=arr[top];
    top--;
    size--;
    // return res;
    System.out.print(res+" ");

  }
  public int peek()
  {
    if(top==-1)
    {
      System.out.println("stack is empty");
    }
    return arr[top];
  }
  // public  boolean isEmpty()
  // {
    //  return top==-1;
  // }
  public static void main(String args[]) {
    // Your code goes here
    Main s=new Main();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    System.out.print(s.peek()+" ");
    s.pop();
    System.out.print(s.peek()+" ");
    s.pop();
    System.out.print(s.peek()+" ");
    System.out.print(s.size+" ");

  }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//using linked lists
class Main {
   class Node{
     int data;
     Node next;
     public Node(int data)
     {
       this.data=data;
       Node next=null;
     }
   }
     Node head=null;
   Node ptr=null;
     int size=0;
  public void push(int data)
  {
    Node newnode=new Node(data);
    if(head==null)
    {
          head=newnode;
    }
    newnode.next=head;
    size++;
    head=newnode;
  }
  public int pop()
  {
    if(head==null)
    {
      System.out.println("stack is empty");
    }
    
    int res=head.data;
    head=head.next;
    size--;
    return res;
    // System.out.print(res+" ");

  }
  public int peek()
  {
    if(head==null)
    {
      System.out.println("stack is empty");
    }
    return head.data;
  }
  public static void main(String args[]) {
    // Your code goes here
    Main s=new Main();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    System.out.print(s.peek()+"-> ");
    s.pop();
    System.out.print(s.peek()+"-> ");
    s.pop();
    System.out.print(s.peek()+"-> ");
    s.pop();
    System.out.println(s.peek());
    System.out.print(s.size+" ");

  }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//using collections
import java.util.*;
class Main {
	public static void main(String args[]) {
		// Your code goes here
		Stack<Integer> s=new Stack<Integer>();
        s.push(10);
		s.push(9);
		s.push(8);
		s.push(7);
        s.push(6);
		while(!s.isEmpty())
        {
			System.out.println(s.peek() +" ");
			s.pop();
		}
		System.out.print(s.size() +" ");
	}
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
class Main {
	public static void insertAtBottom(Stack<Integer> s, int ele)
	{
		if(s.isEmpty())
		{
			s.push(ele);
			return;
		}
	   int topele=s.pop();
	   insertAtBottom(s,ele);
	   s.push(topele);
	}
	public static void reverse(Stack<Integer> s)
	{
       if(s.isEmpty())
	   {
		   return;
	   } 
	   int ele=s.pop();
	   reverse(s);
	   insertAtBottom(s,ele);
	}
	public static void main(String args[]) {
		// Your code goes here
	Stack<Integer> s=new Stack<>();
	s.push(1);
	s.push(2);
	s.push(3);
	insertAtBottom(s,7);
    reverse(s);
	while(!s.isEmpty())
	{
		System.out.print(s.peek()+" ");
		s.pop();
	}
	}
}
