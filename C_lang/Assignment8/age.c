#include<stdio.h>

int agee(int *age);
void main()
{
	int age;
	
	printf("Enter age\n");
	scanf("%d", &age);
	
	agee(&age);
}
int agee(int *age)
{
	if(*age < 12)
	{
		printf("Child");
	}
	else if(*age >= 12 && *age <=19)
	{
		printf("Teenager");
	}
	else if(*age >= 20 && *age <= 59)
	{
		printf("Adult");
	}
	else if(*age >60)
	{
		printf("Senior");
	}
}
