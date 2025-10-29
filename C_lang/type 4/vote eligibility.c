#include<stdio.h>

int age(int);
void main()
{
	int person_age,r;
	
	printf("Enter age\n");
	scanf("%d", &person_age);
	
	r =age(person_age);
	
	if(r==1)
        printf("Eligible for vote");
       else
	   printf("Not eligible for vote"); 
}
int age(int person_age)
{
	if(person_age >= 18)
	{
		return 1;
	}
	else
	{
		return 2;
	}
}
