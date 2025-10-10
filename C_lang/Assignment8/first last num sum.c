#include<stdio.h>

int sum(int *num,int *r,int *r1);
void main()
{
	int num;
	int r,r1;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	sum(&num,&r,&r1);
}
int sum(int *num, int *r, int *r1)
{
	*r = *num % 10;
	while(*num >= 10)
	{
		*num = *num / 10;
	}
	*r1 = *num;
	printf("Sum of first and last number is %d", *r + *r1);
}
