#include<stdio.h>

int evenodd(int *num);
void main()
{
	int num;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	
	evenodd(&num);
}
int evenodd(int *num)
{
	if(*num % 2 == 0)
	{
	printf("Number is Even");
	}
	else
	{
	printf("Number is Odd");
	}
}
