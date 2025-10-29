#include<stdio.h>

int strong(int,int,int,int,int,int);
void main()
{
	int num,i,r,fact,res;
	int sum = 0;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	
	int temp = num;
	res =strong(num,i,r,fact,sum,temp);
	if(res==1)
	printf("Number is strong number");
	else
	printf("Number is not strong number");
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
		return 1;
	}
	else
	{
		return 2;
	}
}

