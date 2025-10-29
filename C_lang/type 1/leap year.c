#include<stdio.h>

void leapyear();
void main()
{
	leapyear();
}
void leapyear()
{
    int year = 2025;
	if(year % 4 == 0)
	{
	printf("leap year");
    }
    else
    {
    	printf("Not leap year");
	}
}
