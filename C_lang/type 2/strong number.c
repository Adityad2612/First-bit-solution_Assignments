#include<stdio.h>

int strong();
void main()
{
	int r;
	r =strong();
	if(r==1)
	printf("Strong number");
	else
	printf("Not strong number");
}
int strong()
{
	int num;
	int fact;
	int sum = 0;
	int i,r;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	
	int temp = num;

	while(num > 0)
	{
		r = num % 10;
		fact = 1;
		i = 1;
		
	while(i <= r)
	{
	fact = fact * i;
	i++;
	}
	
	sum = sum + fact;
	num = num / 10;
	
	}
	
	if(sum == temp)
	{
		return 1;
	}
	else
	{
		return 2;
	}
}
