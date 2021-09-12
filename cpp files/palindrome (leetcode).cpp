//Time Complexity: O(log(x))
#include <bits/stdc++.h>
using namespace std;

 bool reverse(int x) {
    long rev=0;
	int rem=0;
	int temp=x;
	while(x>0)
	{
		rem=x%10;
        x=x/10;
		rev=rem+rev*10;
    }
    if(temp==rev){
        return true;
    }
    return false;
 }
int main() {
	// your code goes here
	long long int x;
	cin>>x;
	bool result = reverse(x);
	if(result==1)
	{
	cout<<"true";	
	}
	else 
	cout<<"false";
	
	return 0;
}