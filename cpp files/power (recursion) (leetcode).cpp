//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
//using recursion
//time complexity:O(n)
#include<bits/stdc++.h>
using namespace std;
 
double myPow(double x,int n)
{
if(n==0)
 return 1;

return x * myPow(x,n-1);
}
int main()
{
double x;
 int n;
cin>>x;
cin>>n;
double result = myPow(x,n);
cout<<fixed<<setprecision(5)<<result<<endl;
} 