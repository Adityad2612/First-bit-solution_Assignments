#include<stdio.h>

void main()
{
	int table = 1;
	int num;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	
	printf("Table of %d is\n", num);
	
	while(table <= 10)
	{
		printf("%d\n", table * num);
		table++;
	}
}
