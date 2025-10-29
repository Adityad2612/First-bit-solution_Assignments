#include<stdio.h>

int facto(int,int);
void main()
{
	int num,r;
	int fact = 1;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	r =facto(num,fact);
	printf("%d",r);
}
int facto(int num, int fact)
{
	while(num > 0)
	{
		fact = fact * num;
		num--;
	}
	return fact;
}
