import java.util.*;
public class LinkedList{
class Node{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
    Node start=null;
    Node ptr=null;
    //insertion operations
    public  void createList(int data)
    {
          Node newnode=new Node(data);
          if(start==null)
          {
              start=newnode;
          }
          else{
               ptr=start;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
              ptr.next=newnode;
          }
    }
    public void insertBegin(int data)
    {
        Node n=new Node(data);
        Node temp=start;
        start=n;
        start.next=temp;
    }
    public void insertMid(int data)
    {
        Node node1=new Node(data);
        Node preptr=start;
        Node temp=null;
        int n=2;
        while(preptr.data!=n)
        {
            preptr=preptr.next;
        }
        temp=preptr.next;
        preptr.next=node1;
        node1.next=temp;
    }
    public void insertEnd(int data)
    {
        Node node=new Node(data);
        Node ptr=start;
        while(ptr.next!=null)
        {
            ptr=ptr.next;
        }
        ptr.next=node;
        node.next=null;
    }
    //deletion operations
    public void deleteBegin()
    {
        Node ptr=start;
        start=start.next;
    }
    public void deleteMid()
    {
        Node ptr=start;
        Node temp;
        Node temp1;
        int n=7;
        while(ptr.data!=n)
        {
            ptr=ptr.next;
        }
        temp=ptr.next;
        temp1=temp.next;
        ptr.next=temp1;
    }
    public void deleteEnd()
    {
        Node ptr=start;
        Node preptr=start;
        while(ptr.next!=null)
        {
            preptr=ptr;
            ptr=ptr.next;
        }
        preptr.next=null;
        
    }
    //printing list in reverse order
    public void reverseDisplay(Node node)
    {
        //recursive approach
        // Node current=start;
        //  if(start == null) {  
        //     System.out.println("List is empty");  
        //     return;  
        // }  
        // else {  
        //     if(current.next == null) {  
        //         System.out.print(current.data + " ");  
        //         return;  
        //     }  
        //     reverseDisplay(current.next);  
        //     System.out.print(current.data + " ");  
        //     }
        //iterative approach
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        while(node.next!=null)
        {
            System.out.print(node.data+" ");
            node=node.next;
        }
         System.out.print(node.data);
    }
    
    public void display()
    {
        Node node=start;
            while(node.next!=null)
            {
                System.out.print(node.data+" ");
                node=node.next;
            }
            System.out.print(node.data);
    }

    public static void main(String args[]) {
        LinkedList list=new LinkedList();
        Scanner s=new Scanner(System.in);
        list.createList(1);
        list.createList(2);
        list.createList(3);
        list.createList(4);
        list.insertBegin(5);
        list.insertMid(7);
        list.insertEnd(10);
        list.deleteBegin();
        list.deleteMid();
        list.deleteEnd();
        list.display();
        System.out.println();
        list.reverseDisplay(list.start);
       
       
    }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
  class Node{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    }
    Node start=null;
    Node ptr=null;
    //insertion operations
    public  void createList(int data)
    {
          Node newnode=new Node(data);
          if(start==null)
          {
              start=newnode;
          }
          else{
               ptr=start;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
              ptr.next=newnode;
          }
    }
    public int findLength(Node head)
    {
      Node ptr=head;
      int count=0;
      while(ptr!=null)
      {
        ptr=ptr.next;
        count++;
      }
      return count;
    }
    public void findMidElement()
    {
      Node slow=start;
      Node fast=start;
      while(fast!=null && fast.next!=null)
      {
        slow=slow.next;
        fast=fast.next.next;
      }
      System.out.println(slow.data);
      // return slow;
    }
    public void nthNodeFromLast(Node head)
    {
      // Scanner s=new Scanner(System.in);  
      int n=2;
      int length=findLength(head);
         int k=(length-n)+1;
      int count=1;
      Node ptr=head;
      while(count!=k)
      {
        ptr=ptr.next;
        count++;
      }
      System.out.println(ptr.data);
    }
    public boolean detectCycle(Node head)
    {
      Node slow=head;
      Node fast=head;
      while(fast!=null && fast.next!=null)
      {
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast)
        return true;
      }
      return false;
    }
    // public boolean isPalindrome(Node head)
    // {
    //   if(head==null || head.next==null)
    //   {
    //     return true;
    //   }
    //   Node middle=findMidElement();
    //   Node secondHalfStart=reverse(middle.next);
    //   Node firstHalfStart=head;
    //   while(secondHalfStart!=null)
    //   {
    //     if(firstHalfStart!=secondHalfStart)
    //     {
    //     return false;
    //     }
    //     firstHalfStart=firstHalfStart.next;
    //     secondHalfStart=secondHalfStart.next;
    //   }
    //   return true;
    // }
    public Node reverse(Node head)
    {
      Node current=head;
      Node next=null;
      Node prev=null;
      while(current!=null)
      {
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
       }
       return prev;
    }
    public void display()
    {
        Node node=start;
            while(node.next!=null)
            {
                System.out.print(node.data+" ");
                node=node.next;
            }
            System.out.println(node.data);
    }
  public static void main (String[] args) throws java.lang.Exception
  {
    // your code goes here
    Ideone list=new Ideone();
    list.createList(1);
    list.createList(2);
    list.createList(3);
    list.createList(4);
    list.createList(6);
    list.createList(7);
    list.createList(8);
    list.display();
    System.out.println(list.findLength(list.start));
    list.findMidElement();
    list.nthNodeFromLast(list.start);
    list.start.next.next.next.next.next.next=list.start;
    if(list.detectCycle(list.start))
    {
      System.out.println("cycle exists");
    }else
    System.out.println("No cycle exists");
  }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	class Node{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    }
    Node start=null;
    Node ptr=null;
    //insertion operations
    public  void insertIntoList(int data)
    {
          Node newnode=new Node(data);
          if(start==null)
          {
              start=newnode;
          }
          else{
               ptr=start;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
              ptr.next=newnode;
          }
    }
    public void removeDuplicates(Node head)
    {
    	Node ptr=head;
    	Node current=null;
    	Node temp=null;
    	while(ptr!=null && ptr.next!=null)
    	{
    		current=ptr.next;
    		temp=ptr;
    		while(current!=null && current.next!=null)
    		{
    			if(ptr.data == current.data)
    			{
    				temp.next=current.next;
    				current=temp.next;
    			}
    		    current=current.next;
    			temp=temp.next;
    		}	
    		ptr=ptr.next;
    	}
    	Node node=head;
        while(node.next!=null)
            {
                System.out.print(node.data+" ");
                node=node.next;
            }
            System.out.println(node.data);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Ideone list=new Ideone();
		list.insertIntoList(1);
		list.insertIntoList(2);
		list.insertIntoList(3);
		list.insertIntoList(2);
		list.insertIntoList(3);
		list.insertIntoList(5);
		list.removeDuplicates(list.start);
	}
}
