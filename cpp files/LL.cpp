#include <iostream>
using namespace std;
 
// creating structure
struct node{
		int data;
		node *next;
	};
	node *head=NULL;
    
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	node *ptr=new node();
	int n;
	cin>>n;
	ptr->data=n;
	ptr->next=NULL;
	head=ptr;
	cout<< ptr->data <<"->";
	}
	cout<<"NULL";
	return 0;
}