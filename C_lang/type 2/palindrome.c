#include<stdio.h>

int palindrome();
void main()
{
	int r;
	r =palindrome();
	if(r == 1)
        printf("Number is Palindrome");
    else
        printf("Number is Not Palindrome");
	
}
int palindrome()
{
	int num = 121;
	int r1, r2, q1, rev, r3;
	r1 = num % 10;
	q1 = num / 10;
	r2 = q1 % 10;
	r3 = q1 / 10;
	
	rev = r1*100 + r2*10 + r3;
	printf("%d\n", rev);
	
	if(num == rev)
	{
		return 1;
	}
	else
	{
		return 2;
	}
}
