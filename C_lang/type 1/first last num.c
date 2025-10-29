#include<stdio.h>

void firstlast();
void main()
{
	firstlast();
}
void firstlast()
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
	printf("Sum of first and last number is %d", r + r1);
}
