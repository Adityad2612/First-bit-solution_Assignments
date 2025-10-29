#include<stdio.h>

int sum(int,int,int);
void main()
{
	int num,res;
	int r,r1;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	res =sum(num,r,r1);
	printf("%d",res);
}
int sum(int num, int r, int r1)
{
	r = num % 10;
	while(num >= 10)
	{
		num = num / 10;
	}
	r1 = num;
	return r+r1;
}
