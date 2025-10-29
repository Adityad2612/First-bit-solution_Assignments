#include<stdio.h>

int summ(int,int);
void main()
{
	int num = 1;
	int sum = 0;
	
	summ(num,sum);
}
int summ(int num, int sum)
{
	while(num <= 5)
	{
		sum = sum+num;
		num++;
	}
	printf("%d", sum);
}
