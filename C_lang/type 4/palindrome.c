#include<stdio.h>

int palin(int,int,int,int,int,int);
void main()
{
	int num, r2, q1, rev, r3,r1,r;
	
	printf("Enter number\n");
	scanf("%d", &num);
	
	r =palin(num,r2,q1,rev,r3,r1);
	if(r == 1)
	printf("Palindrome");
	else
	printf("Not palindrome");
}
int palin(int num, int r2, int q1, int rev, int r3,int r1)
{
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
