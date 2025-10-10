#include<stdio.h>

tablee(int *num,int *table);
void main()
{
	int table = 1;
	int num;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	
	printf("Table of %d is\n", num);
	tablee(&num,&table);
}
tablee(int *num,int *table)
{
	while(*table <= 10)
	{
	printf("%d\n", *table * *num);
	(*table)++;
	}
}
