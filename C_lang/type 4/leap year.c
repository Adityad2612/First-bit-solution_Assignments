#include<stdio.h>

int leap(int);
void main()
{
	int year,r;
	
	printf("Enter year\n");
	scanf("%d", &year);
	
	r =leap(year);
	
	if(r==1)
	printf("Leap year");
	else
	printf("Not leap year");
}
int leap(int year)
{
	if(year % 4 == 0)
	{
	return 1;
    }
    else
    {
    	return 2;
	}
}
