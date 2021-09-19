#include <bits/stdc++.h>
#define len 1000000
using namespace std;
int main()
{
	int n,a[len],size=1;
	int carry=0,temp;
    a[0]=1;
	cin>>n;
    while(n>=2)
    {
	for(int i=0;i<size;i++)
	{
		temp=a[i]*n+carry;
		a[i]=temp%10;
		carry=temp/10;
	}
	while(carry!=0)
	{
		a[size]=carry%10;
		carry=carry/10;
		size++;
	}
	n--;
    }

    for(int i=size-1;i>=0;i--)
    {
		cout<<a[i];
    }

   	return 0;
}
