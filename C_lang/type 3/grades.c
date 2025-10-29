#include<stdio.h>

int grade(int);
void main()
{
	int marks;
	
	printf("Enter marks\n");
	scanf("%d", &marks);
	
	grade(marks);
}
int grade(int marks)
{
	if(marks > 75 && marks <=100)
	{
		printf("Distinction");
	}
	else if(marks >65 && marks <=75)
	{
		printf("First class");
	}
	else if(marks >55 && marks <=65)
	{
		printf("Second class");
	}
	else if(marks > 40 && marks <=55)
	{
		printf("Pass class");
	}
	else if(marks <=40)
	{
		printf("Fail");
	}
	else
	{
		printf("Marks Invalid");
	}
}
