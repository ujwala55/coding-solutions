//using a temporary variable

#include <bits/stdc++.h>
#define f(n) for(int i=0;i<n;i++) cin>>a[i]
using namespace std;

int main() {
	// your code goes here
	int a[10],n=5;
	f(n);
	int temp,i=0;
	int j=n-1;
    while(i<j)
    {
  	   temp=a[i];
  	   a[i]=a[j];
  	   a[j]=temp;
  	   i++;
  	   j--;
     }
    for(int i=0;i<n;i++)
    {
    	cout<<a[i]<<" ";
    }
	return 0;
}
