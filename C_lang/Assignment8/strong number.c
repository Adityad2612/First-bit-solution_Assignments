#include<stdio.h>

int strong(int *num,int *r,int *fact,int *sum,int *temp);
void main()
{
	int num,r,fact;
	int sum = 0;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	
	int temp = num;
	strong(&num,&r,&fact,&sum,&temp);
}
int strong(int *num,int *r, int *fact, int *sum, int *temp)
{
	int i;
	
	while(*num > 0)
	{
	*r = *num % 10;
		
	*fact = 1;
	for(i = 1;i<=*r;i++)
	{
		*fact = *fact * i;
	}
	*sum = *sum + *fact;
	*num = *num / 10;
}
	if(*sum == *temp)
	{
		printf("Strong number");
	}
	else
	{
		printf("Not strong number");
	}
}


