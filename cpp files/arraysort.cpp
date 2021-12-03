#include <bits/stdc++.h>
#define f(n) for(int i=0;i<n;i++) cin>>a[i]
#define fr(n) for(int i=0;i<n;i++) cout<<a[i]
using namespace std;

int main() {
	// your code goes here
	int n,temp,a[10];
	cin>>n;
	f(n);
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	}
	fr(n);
	return 0;
}
