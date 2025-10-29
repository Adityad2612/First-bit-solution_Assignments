#include<stdio.h>

int prime(int,int,int);
void main()
{
	int num;
	int i = 2;
	int flag = 0;   
	
	printf("Enter a number\n");
	scanf("%d", &num);
	prime(num,i,flag);
}
int prime(int num, int i, int flag)
{
	while(i < num)
	{
		if(num % i == 0)
		{
			flag = 1;    
			break;
		}
		i++;
	} 
	if(flag == 0)
	{
		printf("Number is prime");
	}
	else
	{
		printf("Number is not prime");
	}
}
