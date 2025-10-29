#include<stdio.h>

int summ();
void main()
{
	int r;
	r =summ();
	printf("%d",r);
}
int summ()
{
	int num = 1;
	int sum = 0;
	
	while(num <= 5)
	{
		sum = sum+num;
		num++;
	}
	return sum;
}
