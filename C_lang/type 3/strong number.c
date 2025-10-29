#include<stdio.h>

int strong(int,int,int,int,int,int);
void main()
{
	int num,i,r,fact;
	int sum = 0;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	
	int temp = num;
	strong(num,i,r,fact,sum,temp);
}
int strong(int num,int i, int r, int fact, int sum, int temp)
{
	while(i <= r)
	{
	fact = fact * i;
	i++;
	}
	sum = sum + fact;
	num = num / 10;
	if(sum == temp)
	{
		printf("Strong number");
	}
	else
	{
		printf("Not strong number");
	}
}

