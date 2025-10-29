#include<stdio.h>

int summ(int,int);
void main()
{
	int num = 1,r;
	int sum = 0;
	
	r =summ(num,sum);
	printf("%d",r);
}
int summ(int num, int sum)
{
	while(num <= 5)
	{
		sum = sum+num;
		num++;
	}
	return sum;
}
