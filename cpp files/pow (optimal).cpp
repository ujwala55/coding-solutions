//time complexity :O(log(n))
#include<bits/stdc++.h>
using namespace std;

     double myPow(double x, long n) {
        double res = 1.0;  
         if (n < 0) {
            n = -1 * n;
        }
        while (n > 0) {
            if (n % 2 == 0) {
                x = x * x;
                n /=  2;
            } else {
                res =res * x;
                n=n-1;
            }
        }
        if (n < 0) {
            return (1.0) / (res);
        }
        return res;
    }
    int main()
    {
        double x;
        long n;
        cin>>x;
        cin>>n;
        double result = myPow(x,n);
        cout<<fixed<<setprecision(5)<<result<<endl;
    }
