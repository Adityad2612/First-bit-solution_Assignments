#include<stdio.h>

int vote();
void main()
{
	int r;
	r =vote();
	r == 1?printf("Eligible"):printf("Not eligible");
}
int vote()
{
	int person_age = 21;
	if(person_age >= 18)
	{
		return 1;
	}
	else
	{
		return 2;
	}
}
