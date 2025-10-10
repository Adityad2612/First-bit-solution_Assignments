#include<stdio.h>

int perfect(int *num,int *sum);
void main()
{
	int num;
	int sum = 0;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	
	perfect(&num,&sum);
}
int perfect(int *num,int *sum)
{
	int i = 1;
	while(i < *num)
	{
		if(*num % i == 0)
		{
		
		*sum = *sum + i;
	    } 
	    i++;
	}
	if(*num == *sum)
	{
		printf("Number is perfect number");
	}
	else
	{
		printf("Number is not perfect number");
	}
}
