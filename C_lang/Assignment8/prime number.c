#include<stdio.h>

int prime(int *num,int *flag);
void main()
{
	int num;
	int flag = 0;   
	
	printf("Enter a number\n");
	scanf("%d", &num);
	prime(&num,&flag);
}
int prime(int *num,int *flag)
{
	int i = 2;
	while(i < *num)
	{
		if(*num % i == 0)
		{
			*flag = 1;    
			break;
		}
		i++;
	} 
	if(*flag == 0)
	{
		printf("Number is prime");
	}
	else
	{
		printf("Number is not prime");
	}
}
