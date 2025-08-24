#include<stdio.h>

void main()
{
	int num1; int num2; int num3;
	printf("Enter first number");
	scanf("%d", &num1);
	
	printf("Enter second number");
	scanf("%d", &num2);
	
	printf("Enter third number");
	scanf("%d", &num3);
	if(num1 > num2)
	{
		printf("Number one is greater");
	}
	else if(num2 > num3)
	{
		printf("Number two is greater");
	}
	else if(num3 > num1)
	{
		printf("Number three is greater");
	}
}
