#include<stdio.h>

int age(int *person_age);
void main()
{
	int person_age;
	
	printf("Enter age\n");
	scanf("%d", &person_age);
	
	age(&person_age);
}
int age(int *person_age)
{
	if(*person_age >= 18)
	{
		printf("Eligible for vote");
	}
	else
	{
		printf("Not eligible for vote");
	}
}
