#include<stdio.h>

int one(int *num);
void main()
{
	int num = 1;
	printf("Numbers from 1 to 10\n");
	one(&num);
}
int one(int *num)
{
	while(*num <=10)
	{
		printf("%d\n", *num);
		(*num)++; 
	}
}
