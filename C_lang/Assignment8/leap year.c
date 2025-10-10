#include<stdio.h>

int leap(int *year);
void main()
{
	int year;
	
	printf("Enter year\n");
	scanf("%d", &year);
	
	leap(&year);
}
int leap(int *year)
{
	if(*year % 4 == 0)
	{
	printf("leap year");
    }
    else
    {
    	printf("Not leap year");
	}
}
