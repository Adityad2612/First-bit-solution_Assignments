#include<stdio.h>

int arm(int,int,int,int);
void main()
{
	int num;
	int r;
	int sum = 0;
	
	printf("Enter number\n");
	scanf("%d", &num);
	int temp = num;
	arm(num,r,sum,temp);
}
int arm(int num, int r, int sum,int temp)
{
	while(num > 0)
	{
	r = num % 10;
	sum = (sum + r*r*r);
	num = num / 10;
}
	printf("%d", sum);
	
	if(temp == sum)
	{
		printf("\nNumer is armstrong");
	}
	else
	{
		printf("\nNumber is not armstrong");
	}
}

