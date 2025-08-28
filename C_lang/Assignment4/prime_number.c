#include<stdio.h>

void main()
{
	int num;
	int i = 2;
	int flag = 0;   //prime
	
	printf("Enter a number\n");
	scanf("%d", &num);
	
	while(i < num)
	{
		if(num % i == 0)
		{
			flag = 1;    //not prime
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
