#include<stdio.h>

int sum();
void main()
{
	int r;
	r =sum();
	printf("%d",r);
}
int sum()
{
	int num;
	int r,r1;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	
	r = num % 10;
	while(r1 >= 10)
	{
		num = num / 10;
	}
	return r+r1;
}
