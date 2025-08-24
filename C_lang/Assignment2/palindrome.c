#include<stdio.h>

void main()
{
	int num = 121;
	int r1, r2, q1, rev, r3;
	r1 = num % 10;
	q1 = num / 10;
	r2 = q1 % 10;
	r3 = q1 / 10;
	
	rev = r1*100 + r2*10 + r3;
	printf("%d", rev);
	
	if(num == rev)
	{
		printf("\nNumber is Palindrome");
	}
	else
	{
		printf("\nNumber is not Palindrome");
	}
}
