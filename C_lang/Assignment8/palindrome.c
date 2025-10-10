#include<stdio.h>

int palin(int *num, int *r, int *rev, int *temp);
void main()
{
	int num;
	int r;
	int rev = 0;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	
	int temp = num;
	palin(&num,&r,&rev,&temp);
}
int palin(int *num, int *r, int *rev, int *temp)
{
	while(*num > 0)
	{
		*r = *num % 10;
		*rev = *rev * 10 + *r;
		*num = *num / 10;
	}
	if(*temp == *rev)
	{
		printf("Number is palindrome");
	}
	else
	{
		printf("Number is not palindrome");
	}
}
