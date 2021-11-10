//write a c-program to count no.of even and odd digits in a given number and if the sum of the count is even display the reverse of that number else display the same number

#include <stdio.h>

void findSum(int sum , int temp)
{
	int rev=0,rem=0;
	
	if(sum%2==0)
	{
		while(temp>0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		printf("%d",rev);
	}
	else {
		printf("%d",temp);
	}
	
}
int main(void) {
	// your code goes here
	int p=0,q=0,n,r,sum;
	int temp;
	scanf("%d",&n);
	temp=n;
	while(n>0)
	{
		r=n%10;
		if(r%2==0)
		{
			
			p++;
		}
		else{ q++;}
		n=n/10;
	}
	printf("%d %d\n",p,q);
	sum=p+q;
    findSum(sum,temp);
	return 0;
}
