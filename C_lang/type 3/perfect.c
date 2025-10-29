#include<stdio.h>

int perfect(int,int,int);
void main()
{
	int num;
	int i = 1;
	int sum = 0;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	
	perfect(num,i,sum);
}
int perfect(int num, int i, int sum)
{
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
