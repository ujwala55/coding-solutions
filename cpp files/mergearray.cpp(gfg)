#include <iostream>
#define f(n1) for(int i=0;i<n1;i++) cin>>a[i]
#define fr(n2) for(int i=0;i<n2;i++) cin>>b[i]
#define FOR(size) for(int i=0;i<size;i++) cout<<c[i]<<" "
using namespace std;

int main() {
	// your code goes here
	int n1,n2;
	cin>>n1>>n2;
	int a[10],b[10],c[20];
	f(n1);
	fr(n2);
	int size=n1+n2;
	for(int i=0;i<n1;i++)
	{
		c[i]=a[i];
	}
    for(int i = 0, j = n1; j < size && i < n2; i++, j++)
	{ 
		   c[j]=b[i];
	}
	FOR(size);
	return 0;
}
