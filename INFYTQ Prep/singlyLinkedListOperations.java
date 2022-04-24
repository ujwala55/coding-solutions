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
    
