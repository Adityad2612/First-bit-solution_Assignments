#include<stdio.h>

int perfect(int,int,int);
void main()
{
	int num,r;
	int i = 1;
	int sum = 0;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	
	r =perfect(num,i,sum);
	if(r==1)
	printf("Number is perfect");
	else
	printf("Number is not perfect");
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
		return 1;
	}
	else
	{
		return 2;
	}
}
