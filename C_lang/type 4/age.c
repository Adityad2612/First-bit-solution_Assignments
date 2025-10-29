#include<stdio.h>

int agee(int);
void main()
{
	int age,r;
	
	printf("Enter age\n");
	scanf("%d", &age);
	
	r =agee(age);
	
	if(r==1)
	printf("Child");
	else if(r==2)
	printf("Teenager");
	else if(r==3)
	printf("Adult");
	else
	printf("Senior");
}
int agee(int age)
{
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
