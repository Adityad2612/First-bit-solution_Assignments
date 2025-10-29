#include<stdio.h>

int facto();
void main()
{
	int r;
	r =facto();
	printf("%d",r);
}
int facto()
{
	int num;
	int fact = 1;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	
	while(num > 0)
	{
		fact = fact * num;
		num--;
	}
	return fact;
}
