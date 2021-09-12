#include<bits/stdc++.h>
using namespace std;
int main()
{
  int x;
  cin>>x;
  int arr[6];
  int count;
  for(int i=0; i<6; i++)
 {
    cin>>arr[i];
 }
    count=0;
 for(int i=0; i<6; i++)
 {  
     if(arr[i]==x)
     {
         count++;
     }
 }
 if(count!=0)
{
    cout<<count<<endl;
}
else 
cout<<"not found"<<endl;
}