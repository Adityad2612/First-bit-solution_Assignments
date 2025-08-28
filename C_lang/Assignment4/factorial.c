#include<stdio.h>

void main()
{
	int num;
	int fact = 1;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	
	while(num > 0)
	{
		fact = fact * num;
		num--;
	}
	printf("%d", fact);
}
