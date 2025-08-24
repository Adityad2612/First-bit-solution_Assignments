#include<stdio.h>

void main()
{
	int num = 1;
	int sum = 0;
	
	while(num <= 5)
	{
		sum = sum+num;
		num++;
	}
	printf("%d", sum);
}
