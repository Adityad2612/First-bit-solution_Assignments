#include<stdio.h>

int arm();
void main()
{
	int r;
	r =arm();
	if(r==1)
	printf("Armstrong number");
	else
	printf("Not armstrong number");
}
int arm()
{
	int num;
	int r;
	int sum = 0;
	
	printf("Enter number\n");
	scanf("%d", &num);
	int temp = num;
	
	while(num > 0)
	{
	
	r = num % 10;
	sum = (sum + r*r*r);
	num = num / 10;
}
	printf("%d\n", sum);
	
	if(temp == sum)
	{
		return 1;
	}
	else
	{
		return 2;
	}
}
