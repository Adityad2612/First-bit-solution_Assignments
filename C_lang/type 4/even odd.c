#include<stdio.h>

int evenodd(int);
void main()
{
	int num,r;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	
	r =evenodd(num);
	
	if(r==1)
	printf("Even number");
	else
	printf("Odd number");
}
int evenodd(int num)
{
	if(num % 2 == 0)
	{
	return 1;
	}
	else
	{
	return 2;
	}
}
