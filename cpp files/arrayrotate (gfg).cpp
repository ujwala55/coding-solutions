#include<bits/stdc++.h>
#define READ(n,d) cin>>n>>d
#define fo(n) for(int i=0; i<n; i++) cin>>a[i]
#define fr(n) for(int i=0;i<n;i++) cout<<a[i]
#define f(d) for(int i=0;i<d;i++)
#define frr(p)  for(int i=0;i<p;i++)
#define forr(p) for(int i=p;i<n;i++)

using namespace std;
int main()
{   int n,d;
    READ(n,d);
    int p =n-d;
    int a[n] ,temp[d];
    fo(n);
    f(d)
    {
        temp[i]=a[i];
    }
   frr(p)
    {
    	 a[i]=a[i+d];
    }
        int j=0;
    forr(p)
   	{
    	 a[i]=temp[j];
          j++;
    }
    fr(n);
}