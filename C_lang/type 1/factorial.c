#include<stdio.h>

void fact();
void main()
{
	fact();
}
void fact()
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
