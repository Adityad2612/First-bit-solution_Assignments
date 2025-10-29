#include<stdio.h>

int prime();
void main()
{
	int r;
	r =prime();
	if(r==1)
	printf("Prime number");
	else
	printf("Not prime number");
}
int prime()
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
		return 1;
	}
	else
	{
		return 2;
	}
}
