#include<stdio.h>

void numdivide();
void main()
{
	numdivide();
}
void numdivide()
{
	int num;
	
	printf("Enter a numbers\n");
	scanf("%d", &num);
	
	if(num % 3 == 0 && num % 5 == 0)
	{
		printf("Number is divided by both 3 & 5");
	}
	else if(num % 3 == 0)
	   {
			printf("Number is divided by 3");
		}
		else if(num % 5 == 0)
		{
			printf("Number is divided by 5");
		}
		else
		{
			printf("Neither divided by both numbers");
		}
}
