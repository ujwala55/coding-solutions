#include <iostream>
using namespace std;

//creating structure
struct node{
	int data;
	node *next;
};

//creating a head pointer
node *head=NULL;
//insertion at the beginning
 void insertBegin(int d)
 {
   node *ptr=new node();
   ptr->data=d;
   ptr->next=head;
   head=ptr;
 }
// insertion at the end
 void insertEnd (int d)
{
  node *ptr = new node();
  ptr->data=d;
  ptr->next=NULL;

  //If list is empty
  if(head==NULL)
  head=ptr;
  //else list is not empty
  else
  {
   node *temp = head;
   while(temp->next != NULL)
   {
    temp=temp->next;
   }
   temp->next=ptr;
  }
}
 void display()
 {
 	node *ptr=head;
 	while(ptr->next!=NULL)
 	{
 		cout<<ptr->data<<" ";
 		ptr=ptr->next;
 	}
 	cout<<ptr->data;
 }
 
int main() {
	// your code goes here
	
//	cin>>t;
//	while(t--)
//	{
//	cin>>n;
	insertBegin(2);
	insertEnd(3);
	display();
//	}
	return 0;
}
