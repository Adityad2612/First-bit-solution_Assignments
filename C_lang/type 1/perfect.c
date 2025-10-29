#include<stdio.h>

void perfect();
void main()
{
	perfect();
}
void perfect()
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
		printf("Number is perfect number");
	}
	else
	{
		printf("Number is not perfect number");
	}
}
