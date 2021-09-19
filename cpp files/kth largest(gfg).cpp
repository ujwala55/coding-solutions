#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    int k=3;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    sort(arr, arr+n);
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<arr[k-1]<<endl;
}