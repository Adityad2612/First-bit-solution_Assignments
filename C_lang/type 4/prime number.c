#include<stdio.h>

int prime(int,int,int);
void main()
{
	int num,r;
	int i = 2;
	int flag = 0;   
	
	printf("Enter a number\n");
	scanf("%d", &num);
	r =prime(num,i,flag);
	if(r==1)
	printf("Number is prime");
	else
	printf("Number is not prime");
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
		return 1;
	}
	else
	{
		return 2;
	}
}
