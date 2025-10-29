#include<stdio.h>

void voteeligible();
void main()
{
	voteeligible();
}
void voteeligible()
{
	int person_age = 21;
	if(person_age >= 18)
	{
		printf("Eligible for vote");
	}
	else
	{
		printf("Not eligible for vote");
	}
}
