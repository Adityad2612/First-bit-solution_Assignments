#include<stdio.h>

int evenodd();
void main()
{
	int r;
	r =evenodd();
	r == 1?printf("Even"):printf("Odd");
}
int evenodd()
{
	int num1;
	num1 = 10;
	if(num1 % 2 == 0)
	{
	return 1;
	}
	else
	{
	return 2;
	}
}
