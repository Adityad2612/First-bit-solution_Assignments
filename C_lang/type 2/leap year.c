#include<stdio.h>

int leapyear();
void main()
{
	int r;
	r =leapyear();
	if(r == 1)
	printf("Leap year");
	else
	printf("Not leap year");
}
int leapyear()
{
	int year = 2025;
	if(year % 4 == 0)
	{
	return 1;
    }
    else
    {
    return 2;
	}
}
