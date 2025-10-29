#include<stdio.h>

int age();
void main()
{
	int r;
	r =age();
	if(r==1)
	printf("Child");
	else if(r==2)
	printf("Teenager");
	else if(r==3)
	printf("Adult");
	else
	printf("Senior");
}
int age()
{
	int age;
	
	printf("Enter age\n");
	scanf("%d", &age);
	
	if(age < 12)
	{
		return 1;
	}
	else if(age >= 12 && age <=19)
	{
		return 2;
	}
	else if(age >= 20 && age <= 59)
	{
		return 3;
	}
	else if(age >60)
	{
		return 4;
	}
}
