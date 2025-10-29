#include<stdio.h>

int greatest(int,int,int);
void main()
{
	int num1,num2,num3,r;
	printf("Enter first number");
	scanf("%d", &num1);
	
	printf("Enter second number");
	scanf("%d", &num2);
	
	printf("Enter third number");
	scanf("%d", &num3);
	
	r =greatest(num1,num2,num3);
	
	if(r==1)
	printf("One is greatest");
	else if(r==2)
	printf("Two is greatest");
	else
	printf("Third is greatest");
}
int greatest(int num1,int num2, int num3)
{
	if(num1 > num2)
	{
		return 1;
	}
	else if(num2 > num3)
	{
		return 2;
	}
	else if(num3 > num1)
	{
		return 3;
	}
}
