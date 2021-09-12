//Time Complexity: O(log(x))
#include <bits/stdc++.h>
using namespace std;

 int reverse(int x) {
    long rev=0;
	int rem=0;
	while(x!=0)
	{
		rem=x%10;
        x=x/10;
		rev=rem+rev*10;
    }
        return (rev > INT_MAX || rev < INT_MIN) ? 0 : rev;
    }
int main() {
	// your code goes here
	long long int x;
	cin>>x;
	int result = reverse(x);
	cout<<result;
	return 0;
}