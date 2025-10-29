#include<stdio.h>

int perfect();
void main()
{
	int r;
	r =perfect();
	if(r==1)
	printf("Perfect number");
	else
	printf("Not perfect number");
}
int perfect()
{
	int num;
	int i = 1;
	int sum = 0;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	
	while(i < num)
	{
		if(num % i == 0)
		{
		
		sum = sum + i;
	    } 
	    i++;
	}
	if(num == sum)
	{
		return 1;
	}
	else
	{
		return 2;
	}
}
