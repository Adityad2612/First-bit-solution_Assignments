#include<stdio.h>

void pri();
void main()
{
	pri();
}
void pri()
{
	int num = 1;
	printf("Numbers from 1 to 10\n");
	
	while(num <=10)
	{
		printf("%d\n", num);
		num++; 
	}
}
